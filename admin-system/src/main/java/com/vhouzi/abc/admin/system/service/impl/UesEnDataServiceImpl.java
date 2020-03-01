package com.vhouzi.abc.admin.system.service.impl;

import com.vhouzi.abc.common.support.Convert;
import com.vhouzi.abc.admin.system.domain.UesEnData;
import com.vhouzi.abc.admin.system.mapper.UesEnDataMapper;
import com.vhouzi.abc.admin.system.service.IUesEnDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 加密 服务层实现
 * 
 * @author yiran
 * @date 2019-03-20
 */
@Service
public class UesEnDataServiceImpl implements IUesEnDataService 
{
	@Autowired
	private UesEnDataMapper uesEnDataMapper;

	/**
     * 查询加密信息
     * 
     * @param id 加密ID
     * @return 加密信息
     */
    @Override
	public UesEnData selectUesEnDataById(Integer id)
	{
	    return uesEnDataMapper.selectUesEnDataById(id);
	}
	
	/**
     * 查询加密列表
     * 
     * @param uesEnData 加密信息
     * @return 加密集合
     */
	@Override
	public List<UesEnData> selectUesEnDataList(UesEnData uesEnData)
	{
	    return uesEnDataMapper.selectUesEnDataList(uesEnData);
	}
	
    /**
     * 新增加密
     * 
     * @param uesEnData 加密信息
     * @return 结果
     */
	@Override
	public int insertUesEnData(UesEnData uesEnData)
	{
	    return uesEnDataMapper.insertUesEnData(uesEnData);
	}
	
	/**
     * 修改加密
     * 
     * @param uesEnData 加密信息
     * @return 结果
     */
	@Override
	public int updateUesEnData(UesEnData uesEnData)
	{
	    return uesEnDataMapper.updateUesEnData(uesEnData);
	}

	/**
     * 删除加密对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUesEnDataByIds(String ids)
	{
		return uesEnDataMapper.deleteUesEnDataByIds(Convert.toStrArray(ids));
	}

	@Override
	public UesEnData selectUesEnDataByTicket(String ticket) {
		return uesEnDataMapper.selectUesEnDataByTicket(ticket);
	}
	
}
