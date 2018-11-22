package org.fashion.main.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.fashion.main.service.FashionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	/** 1.定义业务层对象 */
	@Resource // by type
	private FashionService fashionService;
	
	/*
	@ResponseBody  // 异步请求的响应结果
	@RequestMapping(value="/loginAjax",produces="application/json; charset=UTF-8")
	public Map<String, Object> login(@RequestParam("uname")String uname, 
			@RequestParam("password")String password 
			,@RequestParam("vcode")String vcode
			,HttpSession session){
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("uname", uname);
			params.put("password", password);
			params.put("vcode", vcode);
			params.put("session", session);
			System.out.println("before requesting data");
			// 响应数据
			Map<String, Object> result = fashionService.login(params);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/
	
	@RequestMapping(value="/loginCheck")
	public Map<String, Object> login(@RequestParam("uname")String uname, 
			@RequestParam("password")String password 
			,@RequestParam("vcode")String vcode
			,HttpSession session){
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("uname", uname);
			params.put("password", password);
			params.put("vcode", vcode);
			params.put("session", session);
			System.out.println("before requesting data");
			// 响应数据
			Map<String, Object> result = fashionService.login(params);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}