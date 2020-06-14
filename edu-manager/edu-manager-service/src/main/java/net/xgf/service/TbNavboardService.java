package net.xgf.service;

import java.util.List;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbNavboardWithBLOBs;
import net.xgf.utils.FjnyResult;

public interface TbNavboardService {
	EasyUIDataGridResult getTbNavboardList(int page,int rows);
	FjnyResult addAndUpdateTbNavboard(TbNavboardWithBLOBs navboard);
	FjnyResult deleteTbNavboard(List<Integer> ids);
}
