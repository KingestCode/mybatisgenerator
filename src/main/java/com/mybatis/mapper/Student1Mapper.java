package com.mybatis.mapper;

import com.mybatis.entity.Student1;
import com.mybatis.entity.Student1Example;
import java.util.List;

import com.mybatis.entity.StudentWithAddressAndGrade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface Student1Mapper {
    int countByExample(Student1Example example);

    int deleteByExample(Student1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student1 record);

    int insertSelective(Student1 record);

    List<Student1> selectByExampleWithRowbounds(Student1Example example, RowBounds rowBounds);

    List<Student1> selectByExample(Student1Example example);

    Student1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student1 record, @Param("example") Student1Example example);

    int updateByExample(@Param("record") Student1 record, @Param("example") Student1Example example);

    int updateByPrimaryKeySelective(Student1 record);

    int updateByPrimaryKey(Student1 record);

    List<Student1> findByGradeId(Integer gradeId);
}