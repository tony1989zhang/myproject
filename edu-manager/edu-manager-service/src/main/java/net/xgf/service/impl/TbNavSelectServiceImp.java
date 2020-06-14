package net.xgf.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.xgf.mapper.TbNavboardMapper;
import net.xgf.pojo.TbNavIdAndName;
import net.xgf.pojo.TbNavboard;
import net.xgf.pojo.TbNavboardExample;
import net.xgf.service.TbNavSelectService;

@Service
public class TbNavSelectServiceImp implements TbNavSelectService {
	
	
	@Autowired
	private TbNavboardMapper tbNavMapper;
	
	@Override
	public List<TbNavIdAndName> getTbNavIdAndName() {
		List<TbNavIdAndName> lists = new ArrayList<TbNavIdAndName>();
		List<TbNavboard> list = tbNavMapper.selectByExample(new TbNavboardExample());
		for (TbNavboard tbNav : list) {
			TbNavIdAndName tbNavIdAndName = new TbNavIdAndName();
			tbNavIdAndName.setId(tbNav.getId());
			tbNavIdAndName.setBoardname(tbNav.getBoardname());
			System.out.println("测试:" + tbNavIdAndName.toString());
			lists.add(tbNavIdAndName);
		}
		return lists;
	}

}
