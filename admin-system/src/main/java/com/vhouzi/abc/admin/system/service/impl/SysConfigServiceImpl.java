package com.vhouzi.abc.admin.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.vhouzi.abc.admin.system.domain.SysConfig;
import com.vhouzi.abc.admin.system.mapper.SysConfigMapper;
import com.vhouzi.abc.admin.system.service.ISysConfigService;
import com.vhouzi.abc.common.constant.UserConstants;
import com.vhouzi.abc.common.support.Convert;
import com.vhouzi.abc.common.utils.StringUtils;
import com.vhouzi.abc.redis.client.IRedisServiceProvider;
import com.vhouzi.abc.redis.common.vo.SysConfigInput;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 参数配置 服务层实现
 * 
 * @author yiran
 */
@Service
public class SysConfigServiceImpl implements ISysConfigService
{
    @Resource
    private SysConfigMapper configMapper;

    @Reference(version = "1.0.0", group = "redis-group")
    private IRedisServiceProvider redisService;

    /**
     * 查询参数配置信息
     * 
     * @param configId 参数配置ID
     * @return 参数配置信息
     */
    @Override
    public SysConfig selectConfigById(Long configId)
    {
        SysConfig config = new SysConfig();
        config.setConfigId(configId);
        return configMapper.selectConfig(config);
    }

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configKey 参数key
     * @return 参数键值
     */
    @Override
    public String selectConfigByKey(String configKey)
    {
        SysConfig config = new SysConfig();
        config.setConfigKey(configKey);
        SysConfig retConfig = configMapper.selectConfig(config);
        return StringUtils.isNotNull(retConfig) ? retConfig.getConfigValue() : "";
    }

    /**
     * 查询参数配置列表
     * 
     * @param config 参数配置信息
     * @return 参数配置集合
     */
    @Override
    public List<SysConfig> selectConfigList(SysConfig config)
    {
        return configMapper.selectConfigList(config);
    }

    /**
     * 新增参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
    @Override
    public int insertConfig(SysConfig config)
    {
        SysConfigInput sysConfigInput = new SysConfigInput();
        BeanUtil.copyProperties(config, sysConfigInput);
        redisService.refreshConfig(sysConfigInput);
        return configMapper.insertConfig(config);
    }

    /**
     * 修改参数配置
     * 
     * @param config 参数配置信息
     * @return 结果
     */
    @Override
    public int updateConfig(SysConfig config)
    {
        SysConfigInput sysConfigInput = new SysConfigInput();
        BeanUtil.copyProperties(config, sysConfigInput);
        redisService.refreshConfig(sysConfigInput);
        return configMapper.updateConfig(config);
    }

    /**
     * 批量删除参数配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteConfigByIds(String ids)
    {
        List<SysConfig> sysConfigList = configMapper.selectConfigByIds(Convert.toStrArray(ids));
        String configKeys = sysConfigList.stream().map(SysConfig::getConfigKey).collect(Collectors.joining(","));
        redisService.removeConfig(configKeys);
        return configMapper.deleteConfigByIds(Convert.toStrArray(ids));
    }

    /**
     * 校验参数键名是否唯一
     * 
     * @param config 参数配置信息
     * @return 结果
     */
    @Override
    public String checkConfigKeyUnique(SysConfig config)
    {
        Long configId = StringUtils.isNull(config.getConfigId()) ? -1L : config.getConfigId();
        SysConfig info = configMapper.checkConfigKeyUnique(config.getConfigKey());
        if (StringUtils.isNotNull(info) && info.getConfigId().longValue() != configId.longValue())
        {
            return UserConstants.CONFIG_KEY_NOT_UNIQUE;
        }
        return UserConstants.CONFIG_KEY_UNIQUE;
    }

    @Override
    public SysConfig selectConfigByConfigKey(String key) {
        return configMapper.selectConfigByKey(key);
    }

    @Override
    public List<SysConfig> selectAll() {
        return configMapper.selectAll();
    }

    @Override
    public List<SysConfig> selectConfigByIds(String[] ids) {
        return configMapper.selectConfigByIds(ids);
    }
}
