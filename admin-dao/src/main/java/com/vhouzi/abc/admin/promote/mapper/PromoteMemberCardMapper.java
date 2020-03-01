package com.vhouzi.abc.admin.promote.mapper;

import com.vhouzi.abc.admin.promote.domain.PromoteMemberCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PromoteMemberCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tm_member_card
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tm_member_card
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    int insert(PromoteMemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tm_member_card
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    PromoteMemberCard selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tm_member_card
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    List<PromoteMemberCard> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tm_member_card
     *
     * @mbggenerated Wed Jan 08 11:16:48 CST 2020
     */
    int updateByPrimaryKey(PromoteMemberCard record);

    PromoteMemberCard findSelective(Map<String, Object> params);
}