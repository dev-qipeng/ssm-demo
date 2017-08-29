package com.qpp.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public @ResponseBody String printHello() {
		return "Hello World SpringMVC";
	}

	@RequestMapping("/just")
	public ModelAndView justHello() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "Hello World");
		mv.setViewName("success");
		return mv;
	}

	@RequestMapping("/just2")
	public String justHello2(Model model) {
		model.addAttribute("data", "just2");
		return "success";
	}

	@RequestMapping("/param")
	public String paramHello(Model model, String name, int age) {
		List list = new ArrayList();
		list.add(name);
		list.add(age);
		model.addAttribute("list", list);
		return "success";
	}
}
