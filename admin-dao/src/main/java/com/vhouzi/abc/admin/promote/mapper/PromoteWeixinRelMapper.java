package com.vhouzi.abc.admin.promote.mapper;

import com.vhouzi.abc.admin.promote.domain.PromoteWeixinRel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PromoteWeixinRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_weixin
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    int deleteByPrimaryKey(Long memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_weixin
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    int insert(PromoteWeixinRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_weixin
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    PromoteWeixinRel selectByPrimaryKey(Long memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_weixin
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    List<PromoteWeixinRel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_weixin
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    int updateByPrimaryKey(PromoteWeixinRel record);

    PromoteWeixinRel findSelective(Map<String, Object> params);

    int updateSelective(Map<String, Object> params);
}