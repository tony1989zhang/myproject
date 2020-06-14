package net.xgf.service;

import net.xgf.pojo.TbCompany;
import net.xgf.utils.FjnyResult;

public interface CompanyService {
	TbCompany getCompany();
	FjnyResult editComPany(TbCompany tbCompany);
}	
