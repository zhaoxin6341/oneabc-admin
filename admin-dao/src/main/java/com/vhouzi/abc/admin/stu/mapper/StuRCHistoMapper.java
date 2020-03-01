package com.vhouzi.abc.admin.stu.mapper;

import com.vhouzi.abc.admin.stu.domain.StuRCHisto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuRCHistoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_th_video_study
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_th_video_study
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    int insert(StuRCHisto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_th_video_study
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    StuRCHisto selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_th_video_study
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    List<StuRCHisto> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_th_video_study
     *
     * @mbggenerated Thu Jan 02 17:51:19 CST 2020
     */
    int updateByPrimaryKey(StuRCHisto record);
}