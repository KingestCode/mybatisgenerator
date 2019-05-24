package com.quanyou.dao.common;

import com.quanyou.entity.common.MallDefinitionPage;
import com.quanyou.entity.common.MallDefinitionPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MallDefinitionPageMapper {
    int countByExample(MallDefinitionPageExample example);

    int deleteByExample(MallDefinitionPageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallDefinitionPage record);

    int insertSelective(MallDefinitionPage record);

    List<MallDefinitionPage> selectByExampleWithRowbounds(MallDefinitionPageExample example, RowBounds rowBounds);

    List<MallDefinitionPage> selectByExample(MallDefinitionPageExample example);

    MallDefinitionPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallDefinitionPage record, @Param("example") MallDefinitionPageExample example);

    int updateByExample(@Param("record") MallDefinitionPage record, @Param("example") MallDefinitionPageExample example);

    int updateByPrimaryKeySelective(MallDefinitionPage record);

    int updateByPrimaryKey(MallDefinitionPage record);
}