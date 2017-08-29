package com.qpp.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qpp.springmvc.dao.pojo.User;
import com.qpp.springmvc.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/login")
	public String login(String username, String password, Model model){
		User user = userService.getUser(username,password);
		model.addAttribute("username", user.getUsername());
		model.addAttribute("id", user.getUserId());
		if(user.getUserType().equals("学生")){
			return "student/index";
		}
		return "teacher/index";
		
	}
}
