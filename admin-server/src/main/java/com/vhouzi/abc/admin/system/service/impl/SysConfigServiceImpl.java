package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysConfigService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.client.ISysConfigServiceProvider;
import com.vhouzi.abc.system.common.domain.SysConfig;
import com.vhouzi.abc.system.dao.client.ISysConfigDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 参数配置 服务层实现
 *
 * @author yiran
 */
@Service
public class SysConfigServiceImpl implements ISysConfigService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    private ISysConfigDaoProvider sysConfigDaoProvider;
    @Reference(version = "1.0.0", group = "system-group")
    private ISysConfigServiceProvider sysConfigServiceProvider;

    @Override
    public SysConfig selectConfigById(Long configId) {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.selectConfigById(configId));
    }

    @Override
    public String selectConfigByKey(String configKey) {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.selectConfigByKey(configKey));
    }

    @Override
    public List<SysConfig> selectConfigList(SysConfig config) {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.selectConfigList(config));
    }

    @Override
    public int insertConfig(SysConfig config) {
        return ResultWrapperUtil.getData(sysConfigServiceProvider.insertConfig(config));
    }

    @Override
    public int updateConfig(SysConfig config) {
        return ResultWrapperUtil.getData(sysConfigServiceProvider.updateConfig(config));
    }

    @Override
    public int deleteConfigByIds(String ids) {
        return ResultWrapperUtil.getData(sysConfigServiceProvider.deleteConfigByIds(ids));
    }

    @Override
    public String checkConfigKeyUnique(SysConfig config) {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.checkConfigKeyUnique(config));
    }

    @Override
    public SysConfig selectConfigByConfigKey(String key) {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.selectConfigByConfigKey(key));
    }

    @Override
    public List<SysConfig> selectAll() {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.selectAll());
    }

    @Override
    public List<SysConfig> selectConfigByIds(String[] ids) {
        return ResultWrapperUtil.getData(sysConfigDaoProvider.selectConfigByIds(ids));
    }
}
