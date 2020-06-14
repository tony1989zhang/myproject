package net.xgf.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import net.xgf.service.TbUserService;
import net.xgf.utils.FjnyResult;

@Service
public class TbUserServiceImpl implements TbUserService {
	
	@Value("${LOGIN_USERNAME}")
	private String LOGIN_USERNAME;
	@Value("${LOGIN_PASSWORD}")
	private String LOGIN_PASSWORD;
	@Override
	public FjnyResult doLogin(HttpSession session,String username, String password) {
		if(username.contentEquals(LOGIN_USERNAME)&&password.equals(LOGIN_PASSWORD)) 
		{
			Map<String,String> map = new HashMap<String,String>();
			map.put("username", LOGIN_USERNAME);
			map.put("password", LOGIN_PASSWORD);
			session.setAttribute("userInfo", map);
			return FjnyResult.ok(map);
		}
		return FjnyResult.build(500, "账号或密码不对");
	}
}
