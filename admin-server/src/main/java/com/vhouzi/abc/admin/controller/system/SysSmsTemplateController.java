package com.vhouzi.abc.admin.controller.system;

import com.vhouzi.abc.admin.system.service.ISysSmsTemplateService;
import com.vhouzi.abc.admin.framework.web.base.BaseController;
import com.vhouzi.abc.common.annotation.Log;
import com.vhouzi.abc.common.base.AjaxResult;
import com.vhouzi.abc.common.enums.BusinessType;
import com.vhouzi.abc.common.page.TableDataInfo;
import com.vhouzi.abc.common.utils.poi.ExcelUtil;
import com.vhouzi.abc.notification.common.vo.SmsTplVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 短信模板 信息操作处理
 *
 * @author yiran
 * @date 2019-03-08
 */
@Controller
@RequestMapping("/message/sysSmsTemplate")
public class SysSmsTemplateController extends BaseController {
    private String prefix = "message/sysSmsTemplate";

    @Autowired
    private ISysSmsTemplateService sysSmsTemplateService;

    @RequiresPermissions("message:sysSmsTemplate:view")
    @GetMapping()
    public String sysSmsTemplate() {
        return prefix + "/sysSmsTemplate";
    }

    /**
     * 查询短信模板列表
     */
    @RequiresPermissions("message:sysSmsTemplate:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SmsTplVo sysSmsTemplate) {
        startPage();//TODO 分页处理 须写入服务端
        List<SmsTplVo> list = sysSmsTemplateService.selectSysSmsTemplateList(sysSmsTemplate);
        return getDataTable(list);
    }


    /**
     * 导出短信模板列表
     */
    @RequiresPermissions("message:sysSmsTemplate:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SmsTplVo sysSmsTemplate) {
        List<SmsTplVo> list = sysSmsTemplateService.selectSysSmsTemplateList(sysSmsTemplate);
        ExcelUtil<SmsTplVo> util = new ExcelUtil<SmsTplVo>(SmsTplVo.class);
        return util.exportExcel(list, "sysSmsTemplate");
    }

    /**
     * 新增短信模板
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存短信模板
     */
    @RequiresPermissions("message:sysSmsTemplate:add")
    @Log(title = "短信模板", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SmsTplVo sysSmsTemplate) {
        Long id = sysSmsTemplateService.insertSysSmsTemplate(sysSmsTemplate);
        return toAjax(id > 0 ? 1 : 0);
    }

    /**
     * 修改短信模板
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        SmsTplVo sysSmsTemplate = sysSmsTemplateService.selectSysSmsTemplateById(id);
        mmap.put("sysSmsTemplate", sysSmsTemplate);
        return prefix + "/edit";
    }

    /**
     * 修改保存短信模板
     */
    @RequiresPermissions("message:sysSmsTemplate:edit")
    @Log(title = "短信模板", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SmsTplVo sysSmsTemplate) {
        return toAjax(sysSmsTemplateService.updateSysSmsTemplate(sysSmsTemplate));
    }

    /**
     * 删除短信模板
     */
    @RequiresPermissions("message:sysSmsTemplate:remove")
    @Log(title = "短信模板", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(sysSmsTemplateService.deleteSysSmsTemplateByIds(ids));
    }

    @PostMapping("/checkTemplateIdUnique")
    @ResponseBody
    public String checkTemplateIdUnique(SmsTplVo smsTemplate) {
        String uniqueFlag = "0";
        SmsTplVo template = sysSmsTemplateService.selectSysSmsTemplateById(smsTemplate.getId());
        if (template != null) {
            uniqueFlag = "1";
        }
        return uniqueFlag;
    }
}
