package net.xgf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbWords;
import net.xgf.service.TbWordsService;
import net.xgf.utils.FjnyResult;

@Controller
@RequestMapping("/words")
public class TbWordsController {

	@Autowired
	private TbWordsService tbWordsService;

	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getTbWordsList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer rows) {
		System.out.println("getTbWordsList");
		return tbWordsService.getTbWordsList(page, rows);
	}

	@RequestMapping("/save")
	@ResponseBody
	public FjnyResult save(TbWords words) {
		FjnyResult fjnyResult = tbWordsService.addAndUpdateTbWords(words);
		return fjnyResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public FjnyResult delete(@RequestParam(value = "ids") List<Integer> ids) {
		return tbWordsService.deleteTbWords(ids);
	}
}
