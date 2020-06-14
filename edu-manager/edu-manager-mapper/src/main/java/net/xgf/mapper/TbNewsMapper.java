package net.xgf.mapper;

import java.util.List;
import net.xgf.pojo.TbNews;
import net.xgf.pojo.TbNewsExample;
import net.xgf.pojo.TbNewsWithBLOBs;

import org.apache.ibatis.annotations.Param;

public interface TbNewsMapper {
    int countByExample(TbNewsExample example);

    int deleteByExample(TbNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbNews record);

    int insertSelective(TbNews record);

    List<TbNewsWithBLOBs> selectByExampleWithBLOBs(TbNewsExample example);

    List<TbNews> selectByExample(TbNewsExample example);

    TbNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByExample(@Param("record") TbNews record, @Param("example") TbNewsExample example);

    int updateByPrimaryKeySelective(TbNews record);

    int updateByPrimaryKeyWithBLOBs(TbNews record);

    int updateByPrimaryKey(TbNews record);
}