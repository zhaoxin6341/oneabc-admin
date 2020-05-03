package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.admin.system.service.ISysMenuService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.system.common.domain.SysMenu;
import com.vhouzi.abc.system.common.domain.SysRole;
import com.vhouzi.abc.system.common.domain.SysUser;
import com.vhouzi.abc.system.dao.client.ISysMenuDaoProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 菜单 业务层处理
 *
 * @author yiran
 */
@Service
public class SysMenuServiceImpl implements ISysMenuService {
    @Reference(version = "1.0.0", group = "system-dao-group")
    ISysMenuDaoProvider sysMenuDaoProvider;

    @Override
    public List<SysMenu> selectMenusByUser(SysUser user) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectMenusByUser(user));
    }

    @Override
    public List<SysMenu> selectMenuList(SysMenu menu) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectMenuList(menu));
    }

    @Override
    public List<SysMenu> selectMenuAll() {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectMenuAll());
    }

    @Override
    public Set<String> selectPermsByUserId(Long userId) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectPermsByUserId(userId));
    }

    @Override
    public List<Map<String, Object>> roleMenuTreeData(SysRole role) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.roleMenuTreeData(role));
    }

    @Override
    public List<Map<String, Object>> menuTreeData() {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.menuTreeData());
    }

    @Override
    public Map<String, String> selectPermsAll() {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectPermsAll());
    }

    @Override
    public int deleteMenuById(Long menuId) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.deleteMenuById(menuId));
    }

    @Override
    public SysMenu selectMenuById(Long menuId) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectMenuById(menuId));
    }

    @Override
    public int selectCountMenuByParentId(Long parentId) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectCountMenuByParentId(parentId));
    }

    @Override
    public int selectCountRoleMenuByMenuId(Long menuId) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.selectCountRoleMenuByMenuId(menuId));
    }

    @Override
    public int insertMenu(SysMenu menu) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.insertMenu(menu));
    }

    @Override
    public int updateMenu(SysMenu menu) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.updateMenu(menu));
    }

    @Override
    public String checkMenuNameUnique(SysMenu menu) {
        return ResultWrapperUtil.getData(sysMenuDaoProvider.checkMenuNameUnique(menu));
    }
}
