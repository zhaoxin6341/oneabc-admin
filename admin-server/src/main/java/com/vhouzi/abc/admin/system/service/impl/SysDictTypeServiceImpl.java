package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysDictTypeService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysDictType;
import com.vhouzi.abc.system.dao.client.ISysDictTypeDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典 业务层处理
 *
 * @author yiran
 */
@Service
public class SysDictTypeServiceImpl implements ISysDictTypeService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysDictTypeDaoProvider sysDictTypeDaoProvider;

    @Override
    public List<SysDictType> selectDictTypeList(SysDictType dictType) {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.selectDictTypeList(dictType));
    }

    @Override
    public List<SysDictType> selectDictTypeAll() {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.selectDictTypeAll());
    }

    @Override
    public SysDictType selectDictTypeById(Long dictId) {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.selectDictTypeById(dictId));
    }

    @Override
    public int deleteDictTypeById(Long dictId) {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.deleteDictTypeById(dictId));
    }

    @Override
    public int deleteDictTypeByIds(String ids) throws Exception {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.deleteDictTypeByIds(ids));
    }

    @Override
    public int insertDictType(SysDictType dictType) {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.insertDictType(dictType));
    }

    @Override
    public int updateDictType(SysDictType dictType) {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.updateDictType(dictType));
    }

    @Override
    public String checkDictTypeUnique(SysDictType dictType) {
        return ResultWrapperUtil.getData(sysDictTypeDaoProvider.checkDictTypeUnique(dictType));
    }
}
