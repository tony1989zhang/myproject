package net.xgf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xgf.pojo.EasyUIDataGridResult;
import net.xgf.pojo.TbBanner;
import net.xgf.pojo.TbBannerIdAndName;
import net.xgf.service.TbBannerService;
import net.xgf.utils.FjnyResult;

@Controller
@RequestMapping("/banner")
public class TBBannerController {
	
	@Autowired
	private TbBannerService tbBannerService;
	
	
	@RequestMapping("getBannerdata")
	@ResponseBody
	public List<TbBannerIdAndName> getTbBannerIdAndName(){
		return tbBannerService.getTbBannerIdAndName();
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getTbBannerList(@RequestParam(defaultValue="1") Integer page, 
			@RequestParam(defaultValue="10") Integer rows) {
		EasyUIDataGridResult  result = tbBannerService.getTbBannerList(page,rows);
		return result;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public FjnyResult save(TbBanner tbBanner) {
		FjnyResult fjnyResult = tbBannerService.addAndUpdateBanner(tbBanner);
		return fjnyResult;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public FjnyResult delete(@RequestParam(value = "ids") List<Integer> ids) {
		return tbBannerService.delete(ids);
	}
}
