package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysRoleService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysRole;
import com.vhouzi.abc.system.dao.client.ISysRoleDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 角色 业务层处理
 *
 * @author yiran
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysRoleDaoProvider sysRoleDaoProvider;

    @Override
    public List<SysRole> selectRoleList(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.selectRoleList(role));
    }

    @Override
    public Set<String> selectRoleKeys(Long userId) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.selectRoleKeys(userId));
    }

    @Override
    public List<SysRole> selectRolesByUserId(Long userId) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.selectRolesByUserId(userId));
    }

    @Override
    public List<SysRole> selectRoleAll() {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.selectRoleAll());
    }

    @Override
    public SysRole selectRoleById(Long roleId) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.selectRoleById(roleId));
    }

    @Override
    public boolean deleteRoleById(Long roleId) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.deleteRoleById(roleId));
    }

    @Override
    public int deleteRoleByIds(String ids) throws Exception {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.deleteRoleByIds(ids));
    }

    @Override
    public int insertRole(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.insertRole(role));
    }

    @Override
    public int updateRole(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.updateRole(role));
    }

    @Override
    public int updateRule(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.updateRule(role));
    }

    @Override
    public String checkRoleNameUnique(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.checkRoleNameUnique(role));
    }

    @Override
    public String checkRoleKeyUnique(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.checkRoleKeyUnique(role));
    }

    @Override
    public int countUserRoleByRoleId(Long roleId) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.countUserRoleByRoleId(roleId));
    }

    @Override
    public int changeStatus(SysRole role) {
        return ResultWrapperUtil.getData(sysRoleDaoProvider.changeStatus(role));
    }
}
