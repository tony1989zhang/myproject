package net.xgf.mapper;

import java.util.List;
import net.xgf.pojo.TbBanner;
import net.xgf.pojo.TbBannerExample;
import org.apache.ibatis.annotations.Param;

public interface TbBannerMapper {
    int countByExample(TbBannerExample example);

    int deleteByExample(TbBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBanner record);

    int insertSelective(TbBanner record);

    List<TbBanner> selectByExample(TbBannerExample example);

    TbBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    int updateByExample(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    int updateByPrimaryKeySelective(TbBanner record);

    int updateByPrimaryKey(TbBanner record);
}