package net.xgf.service;

import java.util.List;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbWords;
import net.xgf.utils.FjnyResult;

public interface TbWordsService {
	EasyUIDataGridResult getTbWordsList(int page,int rows);
	FjnyResult addAndUpdateTbWords(TbWords words);
	FjnyResult deleteTbWords(List<Integer> ids);
}
