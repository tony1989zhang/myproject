package net.xgf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbNewsWithBLOBs;
import net.xgf.service.TbNewsService;
import net.xgf.utils.FjnyResult;

@Controller
@RequestMapping("/news")
public class TbNewsController {

	@Autowired
	private TbNewsService tbNewsService;

	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getTbNewsList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer rows) {
		System.out.println("getTbNewsList");
		return tbNewsService.getTbNewsList(page, rows);
	}

	@RequestMapping("/save")
	@ResponseBody
	public FjnyResult save(TbNewsWithBLOBs news) {
		FjnyResult fjnyResult = tbNewsService.addAndUpdateTbNews(news);
		return fjnyResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public FjnyResult delete(@RequestParam(value = "ids") List<Integer> ids) {
		return tbNewsService.deleteTbNews(ids);
	}
}
