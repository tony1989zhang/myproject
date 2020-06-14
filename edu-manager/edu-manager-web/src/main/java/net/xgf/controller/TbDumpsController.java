package net.xgf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbDumpsWithBLOBs;
import net.xgf.pojo.TbNavIdAndName;
import net.xgf.service.TbDumpsService;
import net.xgf.service.TbNavSelectService;
import net.xgf.utils.FjnyResult;

@Controller
@RequestMapping("/dumps")
public class TbDumpsController {

	@Autowired
	private TbDumpsService tbDumpsService;
	
	@Autowired
	private TbNavSelectService tbNavSelectService;

	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getTbDumpsList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer rows) {
		return tbDumpsService.getTbDumpsList(page, rows);
	}

	@RequestMapping("/save")
	@ResponseBody
	public FjnyResult save(TbDumpsWithBLOBs tbDumps) {
		FjnyResult fjnyResult = tbDumpsService.addAndUpdateTbDumps(tbDumps);
		return fjnyResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public FjnyResult delete(@RequestParam(value = "ids") List<Integer> ids) {
		return tbDumpsService.deleteTbDumps(ids);
	}
	
	@RequestMapping("/getNavdata")
	@ResponseBody
	public List<TbNavIdAndName> getTbNavIdAndName(){
		return tbNavSelectService.getTbNavIdAndName();
	}
	
}
