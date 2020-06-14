package net.xgf.service;

import java.util.List;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbDumpsWithBLOBs;
import net.xgf.utils.FjnyResult;

public interface TbDumpsService {
	EasyUIDataGridResult getTbDumpsList(int page,int rows);
	FjnyResult addAndUpdateTbDumps(TbDumpsWithBLOBs dumps);
	FjnyResult deleteTbDumps(List<Integer> ids);
}
