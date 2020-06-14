package net.xgf.service;

import java.util.List;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbBanner;
import net.xgf.pojo.TbBannerIdAndName;
import net.xgf.utils.FjnyResult;

public interface TbBannerService {
	EasyUIDataGridResult getTbBannerList(int page,int rows);
	FjnyResult addAndUpdateBanner(TbBanner tbBanner);
	FjnyResult delete(List<Integer> ids);
	List<TbBannerIdAndName> getTbBannerIdAndName();
}
