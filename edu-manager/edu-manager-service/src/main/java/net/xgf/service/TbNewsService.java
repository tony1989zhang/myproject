package net.xgf.service;

import java.util.List;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbNewsWithBLOBs;
import net.xgf.utils.FjnyResult;

public interface TbNewsService {
	EasyUIDataGridResult getTbNewsList(int page,int rows);
	FjnyResult addAndUpdateTbNews(TbNewsWithBLOBs news);
	FjnyResult deleteTbNews(List<Integer> ids);
}
