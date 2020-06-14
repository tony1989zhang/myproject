package net.xgf.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.xgf.mapper.TbBannerMapper;
import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbBanner;
import net.xgf.pojo.TbBannerExample;
import net.xgf.pojo.TbBannerExample.Criteria;
import net.xgf.pojo.TbBannerIdAndName;
import net.xgf.service.TbBannerService;
import net.xgf.utils.FjnyResult;

@Service
public class TbBannerServiceImpl implements TbBannerService {

	@Resource
	public TbBannerMapper tbBannerMapper;

	@Override
	public EasyUIDataGridResult getTbBannerList(int page, int rows) {

		PageHelper.startPage(page, rows);
		TbBannerExample example = new TbBannerExample();
		List<TbBanner> list = tbBannerMapper.selectByExample(example);
		System.out.println("打印============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("a:" + list.get(i));
		}
		PageInfo<TbBanner> info = new PageInfo<>(list);
		long total = info.getTotal();
		EasyUIDataGridResult easyUiDataGridResult = new EasyUIDataGridResult(total, list);
		return easyUiDataGridResult;
	}

	@Override
	public FjnyResult addAndUpdateBanner(TbBanner tbBanner) {
		int selective = -1;
		if (tbBanner.getId() != null) {
			selective = tbBannerMapper.updateByPrimaryKeySelective(tbBanner);
		} else {
			selective = tbBannerMapper.insertSelective(tbBanner);
		}
		if (selective <= 0) {
			return FjnyResult.build(500, "添加失败");
		}
		return FjnyResult.ok();
	}

	@Override
	public FjnyResult delete(List<Integer> ids) {
		TbBannerExample example = new TbBannerExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		int i = tbBannerMapper.deleteByExample(example);
		if (i <= 0) {
			return FjnyResult.build(500, "添加错误");
		}
		return FjnyResult.ok();
	}

	@Override
	public List<TbBannerIdAndName> getTbBannerIdAndName() {
		List<TbBannerIdAndName> lists = new ArrayList<TbBannerIdAndName>();
		List<TbBanner> list = tbBannerMapper.selectByExample(new TbBannerExample());
		for (TbBanner tbBanner : list) {
			TbBannerIdAndName tbBannerIdAndName = new TbBannerIdAndName();
			tbBannerIdAndName.setId(tbBanner.getId());
			tbBannerIdAndName.setBannername(tbBanner.getBannername());
			lists.add(tbBannerIdAndName);
		}
		return lists;
	}

}
