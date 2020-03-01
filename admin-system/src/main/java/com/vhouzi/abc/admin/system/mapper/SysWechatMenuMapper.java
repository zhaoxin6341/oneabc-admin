package com.vhouzi.abc.admin.system.mapper;

import com.vhouzi.abc.admin.system.domain.wechat.WechatMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xuzj157
 * @date 2020/2/2 13:47
 */
@Mapper
public interface SysWechatMenuMapper {

    int deleteByPrimaryKey(Long id);

    int insert(WechatMenu record);

    int insertSelective(WechatMenu record);

    List<WechatMenu> selectSelective(WechatMenu wechatMenu);

    int updateByPrimaryKeySelective(WechatMenu record);

    int updateByPrimaryKey(WechatMenu record);

    int deleteByMenuId(String menuId);

}
