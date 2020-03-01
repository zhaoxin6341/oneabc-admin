package com.vhouzi.abc.admin.promote.mapper;

import com.vhouzi.abc.admin.promote.domain.PromoteMeta;
import com.vhouzi.abc.admin.promote.dto.PromoteMetaDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PromoteMetaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_promote_meta
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_promote_meta
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    int insert(PromoteMeta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_promote_meta
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    PromoteMeta selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_promote_meta
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    List<PromoteMeta> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_promote_meta
     *
     * @mbggenerated Wed Jan 01 00:19:51 CST 2020
     */
    int updateByPrimaryKey(PromoteMeta record);

    PromoteMetaDTO findScene(@Param("sceneId") Long sceneId);

    int updateSelective(Map<String, Object> params);
}