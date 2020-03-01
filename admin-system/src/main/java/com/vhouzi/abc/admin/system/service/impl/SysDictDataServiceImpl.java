package com.vhouzi.abc.admin.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.vhouzi.abc.admin.system.model.SysDictDataModel;
import com.vhouzi.abc.common.support.Convert;
import com.vhouzi.abc.admin.system.domain.SysDictData;
import com.vhouzi.abc.admin.system.mapper.SysDictDataMapper;
import com.vhouzi.abc.admin.system.service.ISysDictDataService;
import com.vhouzi.abc.redis.client.IRedisServiceProvider;
import com.vhouzi.abc.redis.common.vo.SysDictDataInput;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 字典 业务层处理
 * 
 * @author yiran
 */
@Service
public class SysDictDataServiceImpl implements ISysDictDataService
{
    @Autowired
    private SysDictDataMapper dictDataMapper;

    @Reference(version = "1.0.0", group = "redis-group")
    private IRedisServiceProvider redisService;

    /**
     * 根据条件分页查询字典数据
     * 
     * @param dictData 字典数据信息
     * @return 字典数据集合信息
     */
    @Override
    public List<SysDictData> selectDictDataList(SysDictData dictData)
    {
        return dictDataMapper.selectDictDataList(dictData);
    }

    /**
     * 根据字典类型查询字典数据
     * 
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    @Override
    public List<SysDictData> selectDictDataByType(String dictType)
    {
        return dictDataMapper.selectDictDataByType(dictType);
    }

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * 
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    @Override
    public String selectDictLabel(String dictType, String dictValue)
    {
        return dictDataMapper.selectDictLabel(dictType, dictValue);
    }

    /**
     * 根据字典数据ID查询信息
     * 
     * @param dictCode 字典数据ID
     * @return 字典数据
     */
    @Override
    public SysDictData selectDictDataById(Long dictCode)
    {
        return dictDataMapper.selectDictDataById(dictCode);
    }

    /**
     * 通过字典ID删除字典数据信息
     * 
     * @param dictCode 字典数据ID
     * @return 结果
     */
    @Override
    public int deleteDictDataById(Long dictCode)
    {
        return dictDataMapper.deleteDictDataById(dictCode);
    }

    /**
     * 批量删除字典数据
     * 
     * @param ids 需要删除的数据
     * @return 结果
     */
    @Override
    public int deleteDictDataByIds(String ids)
    {
        Set<String> dictTypeSet = new HashSet<>();
        List<SysDictData> sysDictDataList = dictDataMapper.selectDictDataByIds(Convert.toStrArray(ids));
        sysDictDataList.forEach(dd ->{
            dictTypeSet.add(dd.getDictType());
        });
        String dictTypes = dictTypeSet.parallelStream().collect(Collectors.joining(","));
        redisService.removeDict(dictTypes);
        return dictDataMapper.deleteDictDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 新增保存字典数据信息
     * 
     * @param dictData 字典数据信息
     * @return 结果
     */
    @Override
    public int insertDictData(SysDictData dictData)
    {
        SysDictDataInput sysDictDataInput = new SysDictDataInput();
        BeanUtil.copyProperties(dictData, sysDictDataInput);
        redisService.refreshDict(sysDictDataInput);
        return dictDataMapper.insertDictData(dictData);
    }

    /**
     * 修改保存字典数据信息
     * 
     * @param dictData 字典数据信息
     * @return 结果
     */
    @Override
    public int updateDictData(SysDictData dictData)
    {
        SysDictDataInput sysDictDataInput = new SysDictDataInput();
        BeanUtil.copyProperties(dictData, sysDictDataInput);
        redisService.refreshDict(sysDictDataInput);
        return dictDataMapper.updateDictData(dictData);
    }

    @Override
    public List<SysDictDataModel> listSelectiveModel(Map<String, Object> params) {
        return dictDataMapper.listSelectiveModel(params);
    }

    @Override
    public List<SysDictData> selectDictDataByIds(String[] dictCodes) {
        return dictDataMapper.selectDictDataByIds(dictCodes);
    }
}
