package net.xgf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.xgf.mapper.TbDumpsMapper;
import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbDumpsExample;
import net.xgf.pojo.TbDumpsExample.Criteria;
import net.xgf.pojo.TbDumpsWithBLOBs;
import net.xgf.service.TbDumpsService;
import net.xgf.utils.FjnyResult;

@Service
public class TbDumpsServiceImpl implements TbDumpsService {
	
	@Resource
	private TbDumpsMapper tbDumpsMapper;

	@Override
	public EasyUIDataGridResult getTbDumpsList(int page, int rows) {
		PageHelper.startPage(page, rows);
		TbDumpsExample example = new TbDumpsExample();
		List<TbDumpsWithBLOBs> withBLOBs = tbDumpsMapper.selectByExampleWithBLOBs(example);
		System.out.println("测试TbDumps..");
		for (int i = 0; i < withBLOBs.size(); i++) {
			System.out.println("withBLOBs:" + withBLOBs.toString());
		}
		PageInfo<TbDumpsWithBLOBs> pageInfo = new PageInfo<TbDumpsWithBLOBs>(withBLOBs);
		long total = pageInfo.getTotal();
		EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(total, withBLOBs);
		return easyUIDataGridResult;
	}

	@Override
	public FjnyResult addAndUpdateTbDumps(TbDumpsWithBLOBs dumps) {
		int i = -1;
		if (dumps.getId() != null) {
			 i = tbDumpsMapper.updateByPrimaryKeySelective(dumps);
		}else {
			 i = tbDumpsMapper.insertSelective(dumps);
		}
		if(i <= 0) {
			return FjnyResult.build(500, "添加或修改失败");
		}
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult deleteTbDumps(List<Integer> ids) {
		TbDumpsExample example = new TbDumpsExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		int i = tbDumpsMapper.deleteByExample(example);
		if(i <=0 ) {
			return FjnyResult.build(500, "删除失败");
		}
		 return FjnyResult.ok();
	}

}
