package org.fashion.main.controller;

import javax.annotation.Resource;

import org.fashion.main.service.FashionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class RequestController {
	
	/** 1.定义业务层对象 */
	@Resource // by type
	private FashionService fashionService;
	
	@RequestMapping(value="/login")
	public String requestLogin(){
		return "login";
	}
	
	@RequestMapping(value="/loginCheck")
	public String requestLoginCheck(){
		return "loginCheck";
	}
	
	@RequestMapping(value="/index")
	public String requestHome(){
		return "index";
	}
}
