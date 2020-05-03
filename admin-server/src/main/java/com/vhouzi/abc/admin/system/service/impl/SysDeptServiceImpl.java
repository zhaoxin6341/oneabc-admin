package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysDeptService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysDept;
import com.vhouzi.abc.system.common.domain.SysRole;
import com.vhouzi.abc.system.dao.client.ISysDeptDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 部门管理 服务实现
 *
 * @author yiran
 */
@Service
public class SysDeptServiceImpl implements ISysDeptService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysDeptDaoProvider sysDeptDaoProvider;

    @Override
    public List<SysDept> selectDeptList(SysDept dept) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.selectDeptList(dept));
    }

    @Override
    public List<Map<String, Object>> selectDeptTree(SysDept dept) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.selectDeptTree(dept));
    }

    @Override
    public List<Map<String, Object>> roleDeptTreeData(SysRole role) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.roleDeptTreeData(role));
    }

    @Override
    public int selectDeptCount(Long parentId) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.selectDeptCount(parentId));
    }

    @Override
    public boolean checkDeptExistUser(Long deptId) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.checkDeptExistUser(deptId));
    }

    @Override
    public int deleteDeptById(Long deptId) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.deleteDeptById(deptId));
    }

    @Override
    public int insertDept(SysDept dept) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.insertDept(dept));
    }

    @Override
    public int updateDept(SysDept dept) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.updateDept(dept));
    }

    @Override
    public SysDept selectDeptById(Long deptId) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.selectDeptById(deptId));
    }

    @Override
    public String checkDeptNameUnique(SysDept dept) {
        return ResultWrapperUtil.getData(sysDeptDaoProvider.checkDeptNameUnique(dept));
    }
}
