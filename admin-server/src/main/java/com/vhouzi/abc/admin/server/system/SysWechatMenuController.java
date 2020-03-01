package com.vhouzi.abc.admin.server.system;

import com.vhouzi.abc.admin.framework.web.base.BaseController;
import com.vhouzi.abc.admin.system.domain.wechat.WechatMenu;
import com.vhouzi.abc.admin.system.service.WechatService;
import com.vhouzi.abc.common.annotation.Log;
import com.vhouzi.abc.common.base.AjaxResult;
import com.vhouzi.abc.common.enums.BusinessType;
import com.vhouzi.abc.common.page.TableDataInfo;
import com.vhouzi.abc.wechat.service.WechatCustomMenusService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/system/wechat/menu")
public class SysWechatMenuController extends BaseController {

    @Resource
    WechatService wechatService;

    @Resource
    WechatCustomMenusService wechatCustomMenusService;

    private String prefix = "system/wechat/menu";


    @RequiresPermissions("system:wechat:menu:view")
    @GetMapping()
    public String config() {
        return prefix + "/menu";
    }

    /**
     * 查询参数配置列表
     */
    @RequiresPermissions("system:wechat:menu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WechatMenu wechatMenu) {
        List<WechatMenu> menus = wechatService.getMenu(wechatMenu);
        return getDataTable(menus);
    }

    /**
     * 查询参数配置列表
     */
    @RequiresPermissions("system:wechat:menu:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult delete(@RequestParam String ids) {
        Boolean flag = wechatService.deletePersonalMenu(ids);
        return AjaxResult.success();
    }

    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存参数配置
     */
    @RequiresPermissions("system:wechat:menu:add")
    @Log(title = "添加微信菜单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WechatMenu wechatMenu) {
        String menuId = wechatService.addMenu(wechatMenu);
        return AjaxResult.success(menuId);
    }

}
