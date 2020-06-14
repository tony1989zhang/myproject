package net.xgf.mapper;

import java.util.List;
import net.xgf.pojo.TbWords;
import net.xgf.pojo.TbWordsExample;
import org.apache.ibatis.annotations.Param;

public interface TbWordsMapper {
    int countByExample(TbWordsExample example);

    int deleteByExample(TbWordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbWords record);

    int insertSelective(TbWords record);

    List<TbWords> selectByExample(TbWordsExample example);

    TbWords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbWords record, @Param("example") TbWordsExample example);

    int updateByExample(@Param("record") TbWords record, @Param("example") TbWordsExample example);

    int updateByPrimaryKeySelective(TbWords record);

    int updateByPrimaryKey(TbWords record);
}