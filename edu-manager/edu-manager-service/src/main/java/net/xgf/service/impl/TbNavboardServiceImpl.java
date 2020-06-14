package net.xgf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.xgf.mapper.TbNavboardMapper;
import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbNavboardExample;
import net.xgf.pojo.TbNavboardExample.Criteria;
import net.xgf.pojo.TbNavboardWithBLOBs;
import net.xgf.service.TbNavboardService;
import net.xgf.utils.FjnyResult;

@Service
public class TbNavboardServiceImpl implements TbNavboardService {

	@Autowired
	private TbNavboardMapper tbNavboardMapper;

	@Override
	public EasyUIDataGridResult getTbNavboardList(int page, int rows) {
		System.out.println("EasyUIDataGridResult");
		PageHelper.startPage(page, rows);
		TbNavboardExample example = new TbNavboardExample();
		List<TbNavboardWithBLOBs> withBLOBs = tbNavboardMapper.selectByExampleWithBLOBs(example);
		System.out.println("测试TbNavboard..");
		for (int i = 0; i < withBLOBs.size(); i++) {
			System.out.println("withBLOBs:" + withBLOBs.toString());
		}
		PageInfo<TbNavboardWithBLOBs> pageInfo = new PageInfo<TbNavboardWithBLOBs>(withBLOBs);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, withBLOBs);
		return easyUIDataGridResult;
	}

	@Override
	public FjnyResult addAndUpdateTbNavboard(TbNavboardWithBLOBs navboard) {
		int i = -1;
		if (navboard.getId() != null) {
			 i = tbNavboardMapper.updateByPrimaryKeySelective(navboard);
		}else {
			 i = tbNavboardMapper.insertSelective(navboard);
		}
		if(i <= 0) {
			return FjnyResult.build(500, "添加或修改失败");
		}
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult deleteTbNavboard(List<Integer> ids) {
		TbNavboardExample example = new TbNavboardExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		int i = tbNavboardMapper.deleteByExample(example);
		if (i <= 0) {
			return FjnyResult.build(500, "删除失败");
		}
		return FjnyResult.ok();
	}

}
