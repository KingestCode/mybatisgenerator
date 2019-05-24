package com.quanyou.dao.common;

import com.quanyou.entity.common.MallDefinitionPageInfo;
import com.quanyou.entity.common.MallDefinitionPageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MallDefinitionPageInfoMapper {
    int countByExample(MallDefinitionPageInfoExample example);

    int deleteByExample(MallDefinitionPageInfoExample example);

    int deleteByPrimaryKey(Integer difinitionPageId);

    int insert(MallDefinitionPageInfo record);

    int insertSelective(MallDefinitionPageInfo record);

    List<MallDefinitionPageInfo> selectByExampleWithRowbounds(MallDefinitionPageInfoExample example, RowBounds rowBounds);

    List<MallDefinitionPageInfo> selectByExample(MallDefinitionPageInfoExample example);

    MallDefinitionPageInfo selectByPrimaryKey(Integer difinitionPageId);

    int updateByExampleSelective(@Param("record") MallDefinitionPageInfo record, @Param("example") MallDefinitionPageInfoExample example);

    int updateByExample(@Param("record") MallDefinitionPageInfo record, @Param("example") MallDefinitionPageInfoExample example);

    int updateByPrimaryKeySelective(MallDefinitionPageInfo record);

    int updateByPrimaryKey(MallDefinitionPageInfo record);
}