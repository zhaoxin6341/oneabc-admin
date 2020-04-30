package com.vhouzi.abc.admin.server.monitor;

import com.vhouzi.abc.common.annotation.Log;
import com.vhouzi.abc.common.base.AjaxResult;
import com.vhouzi.abc.common.config.Global;
import com.vhouzi.abc.common.enums.BusinessType;
import com.vhouzi.abc.common.page.TableDataInfo;
import com.vhouzi.abc.common.utils.poi.ExcelUtil;
import com.vhouzi.abc.admin.framework.util.ShiroUtils;
import com.vhouzi.abc.admin.framework.web.base.BaseController;
//import com.vhouzi.abc.quartz.domain.SysJob;
//import com.vhouzi.abc.quartz.service.ISysJobService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 调度任务信息操作处理
 * 
 * @author yiran
 */
@Controller
@RequestMapping("/monitor/job")
public class SysJobController extends BaseController
{
//    private String prefix = "monitor/job";
//
//    @Autowired
//    private ISysJobService jobService;
//
//    @RequiresPermissions("monitor:job:view")
//    @GetMapping()
//    public String job()
//    {
//        return prefix + "/job";
//    }
//
//    @RequiresPermissions("monitor:job:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(SysJob job)
//    {
//        startPage();
//        List<SysJob> list = jobService.selectJobList(job);
//        return getDataTable(list);
//    }
//
//    @Log(title = "定时任务", businessType = BusinessType.EXPORT)
//    @RequiresPermissions("monitor:job:export")
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(SysJob job)
//    {
//        List<SysJob> list = jobService.selectJobList(job);
//        ExcelUtil<SysJob> util = new ExcelUtil<SysJob>(SysJob.class);
//        return util.exportExcel(list, "定时任务");
//    }
//
//    @Log(title = "定时任务", businessType = BusinessType.DELETE)
//    @RequiresPermissions("monitor:job:remove")
//    @PostMapping("/remove")
//    @ResponseBody
//    public AjaxResult remove(String ids)
//    {
//    	if(DEMOENABLED.equals(Global.isDemoEnabled())){
//			return error("当前模式是演示模式不能修改数据");
//		}
//        try
//        {
//            jobService.deleteJobByIds(ids);
//            return success();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            return error(e.getMessage());
//        }
//    }
//
//    @RequiresPermissions("monitor:job:detail")
//    @GetMapping("/detail/{jobId}")
//    public String detail(@PathVariable("jobId") Long jobId, ModelMap mmap)
//    {
//        mmap.put("name", "job");
//        mmap.put("job", jobService.selectJobById(jobId));
//        return prefix + "/detail";
//    }
//
//    /**
//     * 任务调度状态修改
//     */
//    @Log(title = "定时任务", businessType = BusinessType.UPDATE)
//    @RequiresPermissions("monitor:job:changeStatus")
//    @PostMapping("/changeStatus")
//    @ResponseBody
//    public AjaxResult changeStatus(SysJob job)
//    {
//    	if(DEMOENABLED.equals(Global.isDemoEnabled())){
//			return error("当前模式是演示模式不能修改数据");
//		}
//        job.setUpdateBy(ShiroUtils.getLoginName());
//        return toAjax(jobService.changeStatus(job));
//    }
//
//    /**
//     * 任务调度立即执行一次
//     */
//    @Log(title = "定时任务", businessType = BusinessType.UPDATE)
//    @RequiresPermissions("monitor:job:changeStatus")
//    @PostMapping("/run")
//    @ResponseBody
//    public AjaxResult run(SysJob job)
//    {
//    	if(DEMOENABLED.equals(Global.isDemoEnabled())){
//			return error("当前模式是演示模式不能修改数据");
//		}
//        return toAjax(jobService.run(job));
//    }
//
//    /**
//     * 新增调度
//     */
//    @GetMapping("/add")
//    public String add()
//    {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存调度
//     */
//    @Log(title = "定时任务", businessType = BusinessType.INSERT)
//    @RequiresPermissions("monitor:job:add")
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(SysJob job)
//    {
//    	if(DEMOENABLED.equals(Global.isDemoEnabled())){
//			return error("当前模式是演示模式不能修改数据");
//		}
//        job.setCreateBy(ShiroUtils.getLoginName());
//        return toAjax(jobService.insertJobCron(job));
//    }
//
//    /**
//     * 修改调度
//     */
//    @GetMapping("/edit/{jobId}")
//    public String edit(@PathVariable("jobId") Long jobId, ModelMap mmap)
//    {
//        mmap.put("job", jobService.selectJobById(jobId));
//        return prefix + "/edit";
//    }
//
//    /**
//     * 修改保存调度
//     */
//    @Log(title = "定时任务", businessType = BusinessType.UPDATE)
//    @RequiresPermissions("monitor:job:edit")
//    @PostMapping("/edit")
//    @ResponseBody
//    public AjaxResult editSave(SysJob job)
//    {
//    	if(DEMOENABLED.equals(Global.isDemoEnabled())){
//			return error("当前模式是演示模式不能修改数据");
//		}
//        job.setUpdateBy(ShiroUtils.getLoginName());
//        return toAjax(jobService.updateJobCron(job));
//    }
//
//    /**
//     * 校验cron表达式是否有效
//     */
//    @PostMapping("/checkCronExpressionIsValid")
//    @ResponseBody
//    public boolean checkCronExpressionIsValid(SysJob job)
//    {
//        return jobService.checkCronExpressionIsValid(job.getCronExpression());
//    }
}
