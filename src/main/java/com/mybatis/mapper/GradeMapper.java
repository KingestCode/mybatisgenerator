package com.mybatis.mapper;

import com.mybatis.entity.Grade;
import com.mybatis.entity.GradeExample;
import java.util.List;

import com.mybatis.entity.GradeWithStudents;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
@Mapper
public interface GradeMapper {
    int countByExample(GradeExample example);

    int deleteByExample(GradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExampleWithRowbounds(GradeExample example, RowBounds rowBounds);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);

    GradeWithStudents selectGradeWithStudentsByPrimaryKey(Integer id);


}