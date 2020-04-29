package com.vhouzi.abc.admin.server.system;

import com.vhouzi.abc.admin.framework.web.base.BaseController;
import com.vhouzi.abc.common.base.AjaxResult;
import com.vhouzi.abc.wechat.pojo.ao.menus.WechatCreateDefMenuInput;
import com.vhouzi.abc.wechat.pojo.ao.menus.WechatCreatePersonalizedMenuInput;
import com.vhouzi.abc.wechat.pojo.ao.tagManagement.UserTagBatchTaggingInput;
import com.vhouzi.abc.wechat.pojo.ao.tagManagement.UserTagGetIdListInput;
import com.vhouzi.abc.wechat.pojo.ao.tagManagement.UserTagOutput;
import com.vhouzi.abc.wechat.service.WechatCustomMenusService;
import com.vhouzi.abc.wechat.service.WechatUserTagManagementService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/system/wechat")
public class SysWechatController extends BaseController {
    @Autowired
    private WechatCustomMenusService wechatCustomMenusService;
    @Autowired
    private WechatUserTagManagementService wechatUserTagManagementService;

    @PostMapping("/menu/create")
    @ResponseBody
    public AjaxResult createMenu(@RequestBody WechatCreateDefMenuInput wechatCreateDefMenuInput){
        boolean b = wechatCustomMenusService.createCustomDefinedMenu(wechatCreateDefMenuInput);
        if(b) {
            return AjaxResult.success();
        }else{
            return AjaxResult.error();
        }
    }

    @PostMapping("/personalize/menu/create")
    @ResponseBody
    public AjaxResult createPersonalizeMenu(@RequestBody WechatCreatePersonalizedMenuInput wechatCreatePersonalizedMenuInput){
        String menuId = wechatCustomMenusService.ceratePersonalizedMenu(wechatCreatePersonalizedMenuInput);
        return AjaxResult.success(menuId);
    }

    @GetMapping("/tags/get")
    @ResponseBody
    public AjaxResult getTags(){
        UserTagOutput userTagOutput = wechatUserTagManagementService.allTagGet();
        return AjaxResult.success(userTagOutput);
    }

    @PostMapping("/user/tag/create")
    @ResponseBody
    public AjaxResult createTag(){
        UserTagBatchTaggingInput userTagBatchTaggingInput = new UserTagBatchTaggingInput();
        List<String> openIdList = new ArrayList<>();
        openIdList.add("oTYoww1qqF1oyD-M-cXrP6JE6JSI");
        userTagBatchTaggingInput.setOpenidList(openIdList);
        userTagBatchTaggingInput.setTagid(102);
        wechatUserTagManagementService.tagMemberBatchTagging(userTagBatchTaggingInput);
        return AjaxResult.success();
    }

    @GetMapping("/user/tag/list")
    @ResponseBody
    public AjaxResult getUserTag(){
        UserTagGetIdListInput userTagGetIdListInput = new UserTagGetIdListInput();
        userTagGetIdListInput.setOpenid("oTYoww1qqF1oyD-M-cXrP6JE6JSI");
        return AjaxResult.success(wechatUserTagManagementService.tagGetIdList(userTagGetIdListInput));
    }
}
