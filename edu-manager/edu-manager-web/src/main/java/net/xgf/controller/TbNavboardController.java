package net.xgf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbNavboardWithBLOBs;
import net.xgf.service.TbNavboardService;
import net.xgf.utils.FjnyResult;

@Controller
@RequestMapping("/navboard")
public class TbNavboardController {

	@Autowired
	private TbNavboardService tbNavboardService;

	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getTbNavboardList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer rows) {
		System.out.println("getTbNavboardList");
		return tbNavboardService.getTbNavboardList(page, rows);
	}

	@RequestMapping("/save")
	@ResponseBody
	public FjnyResult save(TbNavboardWithBLOBs navboard) {
		FjnyResult fjnyResult = tbNavboardService.addAndUpdateTbNavboard(navboard);
		return fjnyResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public FjnyResult delete(@RequestParam(value = "ids") List<Integer> ids) {
		return tbNavboardService.deleteTbNavboard(ids);
	}
}
