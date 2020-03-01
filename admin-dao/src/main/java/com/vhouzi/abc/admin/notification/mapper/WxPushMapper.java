package com.vhouzi.abc.admin.notification.mapper;

import com.vhouzi.abc.admin.notification.domain.WxPush;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WxPushMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_th_wx_push
     *
     * @mbggenerated Fri Jan 03 14:32:55 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_th_wx_push
     *
     * @mbggenerated Fri Jan 03 14:32:55 CST 2020
     */
    int insert(WxPush record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_th_wx_push
     *
     * @mbggenerated Fri Jan 03 14:32:55 CST 2020
     */
    WxPush selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_th_wx_push
     *
     * @mbggenerated Fri Jan 03 14:32:55 CST 2020
     */
    List<WxPush> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_th_wx_push
     *
     * @mbggenerated Fri Jan 03 14:32:55 CST 2020
     */
    int updateByPrimaryKey(WxPush record);
}