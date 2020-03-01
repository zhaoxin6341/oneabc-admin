package com.vhouzi.abc.admin.system.service.impl;

import com.alibaba.fastjson.JSON;
import com.vhouzi.abc.admin.system.domain.wechat.WechatMenu;
import com.vhouzi.abc.admin.system.mapper.SysWechatMenuMapper;
import com.vhouzi.abc.admin.system.service.WechatService;
import com.vhouzi.abc.common.exception.BusinessException;
import com.vhouzi.abc.wechat.exception.wechat.WechatOutputException;
import com.vhouzi.abc.wechat.pojo.ao.menus.WechatCreateDefMenuInput;
import com.vhouzi.abc.wechat.pojo.ao.menus.WechatCreatePersonalizedMenuInput;
import com.vhouzi.abc.wechat.pojo.ao.menus.WechatDelPersonalizedMenuInput;
import com.vhouzi.abc.wechat.service.WechatCustomMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信
 *
 * @author xuzj157
 * @date 2020/1/30 19:27
 */
@Service
public class WechatServiceImpl implements WechatService {

    @Autowired
    private WechatCustomMenusService wechatCustomMenusService;

    @Resource
    private SysWechatMenuMapper sysWechatMenuMapper;

    /**
     * todo 需要改为数据库读取
     * 获取所有菜单列表
     *
     * @return
     */
    @Override
    public List<WechatMenu> getMenu(WechatMenu wechatMenu) {
        List<WechatMenu> wechatMenus = new ArrayList<>();

        wechatMenus = sysWechatMenuMapper.selectSelective(wechatMenu);
        return wechatMenus;
    }

    /**
     * 删除菜单
     */
    @Override
    public Boolean deletePersonalMenu(String menuid) {
        Boolean flag = true;
        try {
            WechatDelPersonalizedMenuInput wechatDelPersonalizedMenuInput
                    = new WechatDelPersonalizedMenuInput().setMenuid(menuid);
            flag = wechatCustomMenusService.delPersonalizedMenu(wechatDelPersonalizedMenuInput);

            int line = 0;
            if (flag) {
                line = sysWechatMenuMapper.deleteByMenuId(menuid);
            }
            if (line > 0) {
                flag = true;
            }
        } catch (Exception e) {
            throw new BusinessException("删除失败");
        }
        return flag;
    }

    /**
     * 添加个性化菜单
     * 访问 写入数据库
     *
     * @return menuId 如果创建的是普通菜单不会返回
     */
    @Override
    public String addMenu(WechatMenu wechatMenu) {
        String menuId = new String();
        try {
            if (WechatMenu.MenuType.COMMON_MENU_TYPE.equals(wechatMenu.getType())) {
                //如果普通
                WechatCreateDefMenuInput input
                        = JSON.parseObject(wechatMenu.getMenuJson(), WechatCreateDefMenuInput.class);
                Boolean success = wechatCustomMenusService.createCustomDefinedMenu(input);
//                menuId =
            } else if (WechatMenu.MenuType.CONDITIONAL_MENU_TYPE.equals(wechatMenu.getType())) {
                //如果自定义
                WechatCreatePersonalizedMenuInput input
                        = JSON.parseObject(wechatMenu.getMenuJson(), WechatCreatePersonalizedMenuInput.class);
                menuId = wechatCustomMenusService.ceratePersonalizedMenu(input);
            } else {
                throw new WechatOutputException("不存在该类型");
            }

            //入库
            wechatMenu.setMenuId(menuId);
            int line = sysWechatMenuMapper.insert(wechatMenu);

        } catch (WechatOutputException e) {
            throw new BusinessException(e.getMessage());
        } catch (Exception e) {
            throw new BusinessException("菜单添加失败");
        }

        return menuId;
    }


}
