package com.vhouzi.abc.admin.server.service;

import com.vhouzi.abc.admin.notification.domain.SmsTpl;

import java.util.List;

/**
 * 短信模板 服务层
 * 
 * @author yiran
 * @date 2019-03-08
 */
public interface ISysSmsTemplateService 
{
	/**
     * 查询短信模板信息
     * 
     * @param id 短信模板ID
     * @return 短信模板信息
     */
	public SmsTpl selectSysSmsTemplateById(Long id);

	/**
     * 查询短信模板列表
     * 
     * @return 短信模板集合
	 * @param sysSmsTemplate
     */
	public List<SmsTpl> selectSysSmsTemplateList(SmsTpl sysSmsTemplate);
	
	/**
     * 新增短信模板
     * 
     * @param sysSmsTemplate 短信模板信息
     * @return 结果
     */
	public int insertSysSmsTemplate(SmsTpl sysSmsTemplate);
	
	/**
     * 修改短信模板
     * 
     * @param sysSmsTemplate 短信模板信息
     * @return 结果
     */
	public int updateSysSmsTemplate(SmsTpl sysSmsTemplate);
		
	/**
     * 删除短信模板信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSysSmsTemplateByIds(String ids);
	
}
