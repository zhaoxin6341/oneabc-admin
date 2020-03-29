package com.vhouzi.abc.admin.server.service.impl;

import com.vhouzi.abc.admin.server.service.ISysSmsTemplateService;
import com.vhouzi.abc.common.utils.ResultWrapperUtil;
import com.vhouzi.abc.notification.client.INotificationServiceProvider;
import com.vhouzi.abc.notification.common.vo.*;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 短信模板 服务层实现
 * 
 * @author yiran
 * @date 2019-03-08
 */
@Service
public class SysSmsTemplateServiceImpl implements ISysSmsTemplateService
{
	@Reference(version = "1.0.0", group = "notify-group")
	private INotificationServiceProvider notificationServiceProvider;

	/**
     * 查询短信模板信息
     * 
     * @param id 短信模板ID
     * @return 短信模板信息
     */
    @Override
	public SmsTplVo selectSysSmsTemplateById(Long id)
	{
		FindSmsTplByIdInput findSmsTplByIdInput = new FindSmsTplByIdInput();
		findSmsTplByIdInput.setSmsTplId(id);
	    return ResultWrapperUtil.getData(notificationServiceProvider.selectSmsTemplateById(findSmsTplByIdInput));
	}
	
	/**
     * 查询短信模板列表
     * 
     * @return 短信模板集合
	 * @param cond
     */
	@Override
	public List<SmsTplVo> selectSysSmsTemplateList(SmsTplVo cond)
	{
	    FindSmsTplListOutput findSmsTplListOutput =  ResultWrapperUtil.getData(notificationServiceProvider.selectSmsTemplateList(cond));
	    return findSmsTplListOutput == null ? null : findSmsTplListOutput.getSmsTplList();
	}
	
    /**
     * 新增短信模板
     * 
     * @param newSmsTpl 短信模板信息
     * @return 结果
     */
	@Override
	public Long insertSysSmsTemplate(SmsTplVo newSmsTpl)
	{
	    InsertSmsTplOutput insertSmsTplOutput = ResultWrapperUtil.getData(notificationServiceProvider.insertSmsTemplate(newSmsTpl));
	    return insertSmsTplOutput == null ? 0 : insertSmsTplOutput.getId();
	}
	
	/**
     * 修改短信模板
     * 
     * @param updSmsTpl 短信模板信息
     * @return 结果
     */
	@Override
	public int updateSysSmsTemplate(SmsTplVo updSmsTpl)
	{
	    UpdateSmsTplOutput updateSmsTplOutput = ResultWrapperUtil.getData(notificationServiceProvider.updateSmsTemplate(updSmsTpl));
	    return updateSmsTplOutput == null ? 0 : updateSmsTplOutput.getCnt();
	}

	/**
     * 删除短信模板对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSysSmsTemplateByIds(String ids)
	{
		DelSmsTplByIdsInput delSmsTplByIdsInput = new DelSmsTplByIdsInput();
		delSmsTplByIdsInput.setIds(ids);
		DelSmsTplByIdsOutput delSmsTplByIdsOutput = ResultWrapperUtil.getData(notificationServiceProvider.deleteSmsTemplateByIds(delSmsTplByIdsInput));
		return delSmsTplByIdsOutput == null ? 0 : delSmsTplByIdsOutput.getCnt();
	}
}
