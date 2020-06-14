package net.xgf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.xgf.pojo.TbCompany;
import net.xgf.service.CompanyService;
import net.xgf.utils.FjnyResult;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companService;
	
	@RequestMapping("/getCompany")
	@ResponseBody
	public TbCompany getCompany() {
		return companService.getCompany();
	}
	
	
	@RequestMapping("/editComPany")
	@ResponseBody
	public FjnyResult editComPany(TbCompany tbCompany){
		return companService.editComPany(tbCompany);
	}

}
