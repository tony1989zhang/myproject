package net.xgf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.xgf.mapper.TbCompanyMapper;
import net.xgf.pojo.TbCompany;
import net.xgf.pojo.TbCompanyExample;
import net.xgf.service.CompanyService;
import net.xgf.utils.FjnyResult;


@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Resource
	private TbCompanyMapper tbCompanyMapper;

	@Override
	public TbCompany getCompany() {
		TbCompanyExample example = new TbCompanyExample();
		List<TbCompany> list = tbCompanyMapper.selectByExample(example);
		if (null == list ||list.isEmpty()) {
			return new TbCompany();
		}
		return list.get(0);
	}

	@Override
	public FjnyResult editComPany(TbCompany tbCompany) {
		int i = -1;
		if (tbCompany.getId() == null) {
			i = tbCompanyMapper.insertSelective(tbCompany);
		}else {
			i = tbCompanyMapper.updateByPrimaryKey(tbCompany);
		}
		if(i <=0) {
			return FjnyResult.build(500, "添加失败");
		}
		return FjnyResult.ok();
	}

}
