package com.qpp.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qpp.springmvc.dao.pojo.Student;
import com.qpp.springmvc.dao.pojo.User;
import com.qpp.springmvc.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/shouye")
	public String index(){
		return "student/shouye";
	}
	
	@RequestMapping("/index")
	public String shouye(){
		return "student/index";
	}
	
	@RequestMapping("/studentinfo")
	public String getStudentInfo(Model model,int id){
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "student/studentinfo";
	}
	
	@RequestMapping("/applyproject")
	public String applyProject(User user){
		
		return "student/projectapply";
	}
	@RequestMapping("update")
	public void updateStudentInfo(User user){
		
	}
}
