package net.xgf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.xgf.mapper.TbWordsMapper;
import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbWords;
import net.xgf.pojo.TbWordsExample;
import net.xgf.pojo.TbWordsExample.Criteria;
import net.xgf.service.TbWordsService;
import net.xgf.utils.FjnyResult;

@Service
public class TbWordsServiceImpl implements TbWordsService {

	@Autowired
	private TbWordsMapper tbWordsMapper;

	@Override
	public EasyUIDataGridResult getTbWordsList(int page, int rows) {
		System.out.println("EasyUIDataGridResult");
		PageHelper.startPage(page, rows);
		TbWordsExample example = new TbWordsExample();
		List<TbWords> withBLOBs = tbWordsMapper.selectByExample(example);
		System.out.println("测试TbWords..");
		for (int i = 0; i < withBLOBs.size(); i++) {
			System.out.println("withBLOBs:" + withBLOBs.toString());
		}
		PageInfo<TbWords> pageInfo = new PageInfo<TbWords>(withBLOBs);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, withBLOBs);
		return easyUIDataGridResult;
	}

	@Override
	public FjnyResult addAndUpdateTbWords(TbWords words) {
		int i = -1;
		if (words.getId() != null) {
			 i = tbWordsMapper.updateByPrimaryKeySelective(words);
		}else {
			 i = tbWordsMapper.insertSelective(words);
		}
		if(i <= 0) {
			return FjnyResult.build(500, "添加或修改失败");
		}
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult deleteTbWords(List<Integer> ids) {
		TbWordsExample example = new TbWordsExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		int i = tbWordsMapper.deleteByExample(example);
		if (i <= 0) {
			return FjnyResult.build(500, "删除失败");
		}
		return FjnyResult.ok();
	}

}
