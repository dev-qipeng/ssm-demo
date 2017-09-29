package sqar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sqar.db.model.Coin;

@Controller
@RequestMapping("student")
public class StudentController {

	
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
		return "student/studentinfo";
	}
	
	@RequestMapping("/applyproject")
	public String applyProject(Coin user){
		
		return "student/projectapply";
	}
	@RequestMapping("update")
	public void updateStudentInfo(Coin user){
		
	}
}
