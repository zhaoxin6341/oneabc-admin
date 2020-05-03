package com.vhouzi.abc.admin.controller.system;

import com.vhouzi.abc.admin.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system/wechat/menu")
public class SysWechatMenuController extends BaseController {

//    @Resource
//    WechatService wechatService;
//
//    @Resource
//    WechatCustomMenusService wechatCustomMenusService;
//
//    private String prefix = "system/wechat/menu";
//
//
//    @RequiresPermissions("system:wechat:menu:view")
//    @GetMapping()
//    public String config() {
//        return prefix + "/menu";
//    }
//
//    /**
//     * 查询参数配置列表
//     */
//    @RequiresPermissions("system:wechat:menu:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(WechatMenu wechatMenu) {
//        List<WechatMenu> menus = wechatService.getMenu(wechatMenu);
//        return getDataTable(menus);
//    }
//
//    /**
//     * 查询参数配置列表
//     */
//    @RequiresPermissions("system:wechat:menu:remove")
//    @PostMapping("/remove")
//    @ResponseBody
//    public AjaxResult delete(@RequestParam String ids) {
//        Boolean flag = wechatService.deletePersonalMenu(ids);
//        return AjaxResult.success();
//    }
//
//    @GetMapping("/add")
//    public String add() {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存参数配置
//     */
//    @RequiresPermissions("system:wechat:menu:add")
//    @Log(title = "添加微信菜单", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(WechatMenu wechatMenu) {
//        String menuId = wechatService.addMenu(wechatMenu);
//        return AjaxResult.success(menuId);
//    }

}
