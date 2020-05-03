package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysDictDataService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.client.ISysDictDataServiceProvider;
import com.vhouzi.abc.system.common.domain.SysDictData;
import com.vhouzi.abc.system.dao.client.ISysDictDataDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典 业务层处理
 *
 * @author yiran
 */
@Service
public class SysDictDataServiceImpl implements ISysDictDataService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysDictDataDaoProvider sysDictDataDaoProvider;

    @Reference(version = "1.0.0", group = "system-group")
    ISysDictDataServiceProvider sysDictDataServiceProvider;

    @Override
    public List<SysDictData> selectDictDataList(SysDictData dictData) {
        return ResultWrapperUtil.getData(sysDictDataDaoProvider.selectDictDataList(dictData));
    }

    @Override
    public List<SysDictData> selectDictDataByType(String dictType) {
        return ResultWrapperUtil.getData(sysDictDataDaoProvider.selectDictDataByType(dictType));
    }

    @Override
    public String selectDictLabel(String dictType, String dictValue) {
        return ResultWrapperUtil.getData(sysDictDataDaoProvider.selectDictLabel(dictType, dictValue));
    }

    @Override
    public SysDictData selectDictDataById(Long dictCode) {
        return ResultWrapperUtil.getData(sysDictDataDaoProvider.selectDictDataById(dictCode));
    }

    @Override
    public int deleteDictDataById(Long dictCode) {
        return ResultWrapperUtil.getData(sysDictDataServiceProvider.deleteDictDataById(dictCode));
    }

    @Override
    public int deleteDictDataByIds(String ids) {
        return ResultWrapperUtil.getData(sysDictDataServiceProvider.deleteDictDataByIds(ids));
    }

    @Override
    public int insertDictData(SysDictData dictData) {
        return ResultWrapperUtil.getData(sysDictDataServiceProvider.insertDictData(dictData));
    }

    @Override
    public int updateDictData(SysDictData dictData) {
        return ResultWrapperUtil.getData(sysDictDataServiceProvider.updateDictData(dictData));
    }

    @Override
    public List<SysDictData> selectDictDataByIds(String[] dictCodes) {
        return ResultWrapperUtil.getData(sysDictDataDaoProvider.selectDictDataByIds(dictCodes));
    }
}
