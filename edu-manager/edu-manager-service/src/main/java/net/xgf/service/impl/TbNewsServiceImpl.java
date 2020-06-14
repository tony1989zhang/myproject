package net.xgf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.xgf.mapper.TbNewsMapper;
import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbNewsExample;
import net.xgf.pojo.TbNewsExample.Criteria;
import net.xgf.pojo.TbNewsWithBLOBs;
import net.xgf.service.TbNewsService;
import net.xgf.utils.FjnyResult;

@Service
public class TbNewsServiceImpl implements TbNewsService {

	@Autowired
	private TbNewsMapper tbNewsMapper;

	@Override
	public EasyUIDataGridResult getTbNewsList(int page, int rows) {
		System.out.println("EasyUIDataGridResult");
		PageHelper.startPage(page, rows);
		TbNewsExample example = new TbNewsExample();
		List<TbNewsWithBLOBs> withBLOBs = tbNewsMapper.selectByExampleWithBLOBs(example);
		System.out.println("测试TbNews..");
		for (int i = 0; i < withBLOBs.size(); i++) {
			System.out.println("withBLOBs:" + withBLOBs.toString());
		}
		PageInfo<TbNewsWithBLOBs> pageInfo = new PageInfo<TbNewsWithBLOBs>(withBLOBs);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, withBLOBs);
		return easyUIDataGridResult;
	}

	@Override
	public FjnyResult addAndUpdateTbNews(TbNewsWithBLOBs navboard) {
		int i = -1;
		if (navboard.getId() != null) {
			 i = tbNewsMapper.updateByPrimaryKeySelective(navboard);
		}else {
			 i = tbNewsMapper.insertSelective(navboard);
		}
		if(i <= 0) {
			return FjnyResult.build(500, "添加或修改失败");
		}
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult deleteTbNews(List<Integer> ids) {
		TbNewsExample example = new TbNewsExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		int i = tbNewsMapper.deleteByExample(example);
		if (i <= 0) {
			return FjnyResult.build(500, "删除失败");
		}
		return FjnyResult.ok();
	}

}
