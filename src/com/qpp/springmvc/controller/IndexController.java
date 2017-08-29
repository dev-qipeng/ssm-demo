package com.qpp.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qpp.springmvc.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
