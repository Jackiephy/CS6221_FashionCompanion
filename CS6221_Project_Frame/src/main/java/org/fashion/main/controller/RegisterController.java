package org.fashion.main.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.fashion.main.domain.Clothes;
import org.fashion.main.service.FashionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
	/** 1.定义业务层对象 */
	@Resource // by type
	private FashionService fashionService;
	
	@ResponseBody  // 异步请求的响应结果
	@RequestMapping(value="/registerCheck",produces="application/json; charset=UTF-8")
	public Map<String, Object> register(@RequestParam("uname")String uname, 
			@RequestParam("password")String password 
			,@RequestParam("preference")Clothes preference
			,@RequestParam("address")String address
			,@RequestParam("phone")String phone ){
		try {
			Map<String, Object> params = new HashMap<>();
			params.put("uname", uname);
			params.put("password", password);
			params.put("preference", preference);
			params.put("address", address);
			params.put("phone", phone);
			// 响应数据
			Map<String, Object> result = fashionService.register(params);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
