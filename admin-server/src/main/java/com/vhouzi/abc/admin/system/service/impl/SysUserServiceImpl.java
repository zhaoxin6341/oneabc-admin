package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysUserService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysUser;
import com.vhouzi.abc.system.dao.client.ISysUserDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 用户 业务层处理
 *
 * @author yiran
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysUserDaoProvider sysUserDaoProvider;

    @Override
    public List<SysUser> selectUserList(SysUser user) {
        return ResultWrapperUtil.getPageData(sysUserDaoProvider.selectUserList(user));
    }

    @Override
    public List<SysUser> selectUserListByPostCode(String postCode) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserListByPostCode(postCode));
    }

    @Override
    public SysUser selectUserByLoginName(String userName) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserByLoginName(userName));
    }

    @Override
    public SysUser selectUserByPhoneNumber(String phoneNumber) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserByPhoneNumber(phoneNumber));
    }

    @Override
    public SysUser selectUserByEmail(String email) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserByEmail(email));
    }

    @Override
    public SysUser selectUserById(Long userId) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserById(userId));
    }

    @Override
    public int deleteUserById(Long userId) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.deleteUserById(userId));
    }

    @Override
    public int deleteUserByIds(String ids) throws Exception {
        return ResultWrapperUtil.getData(sysUserDaoProvider.deleteUserByIds(ids));
    }

    @Override
    public int insertUser(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.insertUser(user));
    }

    @Override
    public int updateUser(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.updateUser(user));
    }

    @Override
    public int updateUserInfo(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.updateUserInfo(user));
    }

    @Override
    public int resetUserPwd(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.resetUserPwd(user));
    }

    @Override
    public String checkLoginNameUnique(String loginName) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.checkLoginNameUnique(loginName));
    }

    @Override
    public String checkPhoneUnique(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.checkPhoneUnique(user));
    }

    @Override
    public String checkEmailUnique(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.checkEmailUnique(user));
    }

    @Override
    public String selectUserRoleGroup(Long userId) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserRoleGroup(userId));
    }

    @Override
    public String selectUserPostGroup(Long userId) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserPostGroup(userId));
    }

    @Override
    public String importUser(List<SysUser> userList, Boolean isUpdateSupport, String operName) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.importUser(userList, isUpdateSupport, operName));
    }

    @Override
    public int changeStatus(SysUser user) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.changeStatus(user));
    }

    @Override
    public List<Map<String, Object>> selectUserTree() {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectUserTree());
    }

    @Override
    public String selectPostCodeByUserId(String userId) {
        return ResultWrapperUtil.getData(sysUserDaoProvider.selectPostCodeByUserId(userId));
    }
}
