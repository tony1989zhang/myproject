package net.xgf.mapper;

import java.util.List;
import net.xgf.pojo.TbNavboard;
import net.xgf.pojo.TbNavboardExample;
import net.xgf.pojo.TbNavboardWithBLOBs;

import org.apache.ibatis.annotations.Param;

public interface TbNavboardMapper {
    int countByExample(TbNavboardExample example);

    int deleteByExample(TbNavboardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbNavboard record);

    int insertSelective(TbNavboard record);

    List<TbNavboardWithBLOBs> selectByExampleWithBLOBs(TbNavboardExample example);

    List<TbNavboard> selectByExample(TbNavboardExample example);

    TbNavboard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbNavboard record, @Param("example") TbNavboardExample example);

    int updateByExampleWithBLOBs(@Param("record") TbNavboard record, @Param("example") TbNavboardExample example);

    int updateByExample(@Param("record") TbNavboard record, @Param("example") TbNavboardExample example);

    int updateByPrimaryKeySelective(TbNavboard record);

    int updateByPrimaryKeyWithBLOBs(TbNavboard record);

    int updateByPrimaryKey(TbNavboard record);
}