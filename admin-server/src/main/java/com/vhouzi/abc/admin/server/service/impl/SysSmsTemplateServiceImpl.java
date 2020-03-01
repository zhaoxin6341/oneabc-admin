package com.vhouzi.abc.admin.server.service.impl;

import com.vhouzi.abc.admin.notification.domain.SmsTpl;
import com.vhouzi.abc.admin.notification.mapper.SmsTplMapper;
import com.vhouzi.abc.admin.server.service.ISysSmsTemplateService;
import com.vhouzi.abc.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private SmsTplMapper sysSmsTemplateMapper;
	/**
     * 查询短信模板信息
     * 
     * @param id 短信模板ID
     * @return 短信模板信息
     */
    @Override
	public SmsTpl selectSysSmsTemplateById(Long id)
	{
	    return sysSmsTemplateMapper.selectByPrimaryKey(id);
	}
	
	/**
     * 查询短信模板列表
     * 
     * @return 短信模板集合
	 * @param sysSmsTemplate
     */
	@Override
	public List<SmsTpl> selectSysSmsTemplateList(SmsTpl sysSmsTemplate)
	{
	    return sysSmsTemplateMapper.listByObj(sysSmsTemplate);
	}
	
    /**
     * 新增短信模板
     * 
     * @param sysSmsTemplate 短信模板信息
     * @return 结果
     */
	@Override
	public int insertSysSmsTemplate(SmsTpl sysSmsTemplate)
	{
	    return sysSmsTemplateMapper.insert(sysSmsTemplate);
	}
	
	/**
     * 修改短信模板
     * 
     * @param sysSmsTemplate 短信模板信息
     * @return 结果
     */
	@Override
	public int updateSysSmsTemplate(SmsTpl sysSmsTemplate)
	{
	    return sysSmsTemplateMapper.updateByPrimaryKey(sysSmsTemplate);
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
		return sysSmsTemplateMapper.deleteSysSmsTemplateByIds(Convert.toStrArray(ids));
	}
}
