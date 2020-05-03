package com.vhouzi.abc.admin.controller.system;

import com.vhouzi.abc.admin.framework.web.base.BaseController;
import com.vhouzi.abc.admin.framework.web.domain.server.Jvm;
import com.vhouzi.abc.admin.system.service.ISysMenuService;
import com.vhouzi.abc.common.config.Global;
import com.vhouzi.abc.system.common.domain.SysMenu;
import com.vhouzi.abc.system.common.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Properties;

/**
 * 首页 业务处理
 * 
 * @author yiran
 */
@Controller
public class SysIndexController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUser user = getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", Global.getCopyrightYear());
        //mmap.put("demoEnabled", Global.isDemoEnabled());
        return "index";
    }

    
    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
    	Jvm jvm = new Jvm();//虚拟机信息
        Properties props = System.getProperties();
        jvm.setTotal(Runtime.getRuntime().totalMemory());
        jvm.setMax(Runtime.getRuntime().maxMemory());
        jvm.setFree(Runtime.getRuntime().freeMemory());
        jvm.setVersion(props.getProperty("java.version"));
        jvm.setHome(props.getProperty("java.home"));
        mmap.put("jvm",jvm);
        return "main";
    }
}
