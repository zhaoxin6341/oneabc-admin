package com.vhouzi.abc.admin.system.service;

import com.vhouzi.abc.admin.system.domain.wechat.WechatMenu;

import java.util.List;

/**
 * 微信
 *
 * @author xuzj157
 * @date 2020/1/30 19:27
 */
public interface WechatService {

    /**
     * 获取菜单
     *
     * @return
     */
    List<WechatMenu> getMenu(WechatMenu wechatMenu);

    /**
     * 删除菜单
     *
     * @param menuid
     * @return
     */
    Boolean deletePersonalMenu(String menuid);

    /**
     * 添加个性化菜单
     *
     * @return menuId
     */
    String addMenu(WechatMenu wechatMenu);

}
