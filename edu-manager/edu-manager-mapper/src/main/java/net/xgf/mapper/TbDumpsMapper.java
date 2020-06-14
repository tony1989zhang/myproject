package net.xgf.mapper;

import java.util.List;
import net.xgf.pojo.TbDumps;
import net.xgf.pojo.TbDumpsExample;
import net.xgf.pojo.TbDumpsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface TbDumpsMapper {
    int countByExample(TbDumpsExample example);

    int deleteByExample(TbDumpsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDumpsWithBLOBs record);

    int insertSelective(TbDumpsWithBLOBs record);

    List<TbDumpsWithBLOBs> selectByExampleWithBLOBs(TbDumpsExample example);

    List<TbDumps> selectByExample(TbDumpsExample example);

    TbDumpsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDumpsWithBLOBs record, @Param("example") TbDumpsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbDumpsWithBLOBs record, @Param("example") TbDumpsExample example);

    int updateByExample(@Param("record") TbDumps record, @Param("example") TbDumpsExample example);

    int updateByPrimaryKeySelective(TbDumpsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbDumpsWithBLOBs record);

    int updateByPrimaryKey(TbDumps record);
}