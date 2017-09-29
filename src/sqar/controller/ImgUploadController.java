package sqar.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sqar.service.ProjectService;

@Controller
public class ImgUploadController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> fileUpload(MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException{
		System.out.println("开始执行");
		if (file == null) {
			Map<String,Object> resp = new HashMap<String,Object>();
			resp.put("status", "error");
			return resp;
		}
		
		
		String url = projectService.uploadImg(file);
		
		if (url != null && !url.equals("")) {
			System.out.println("上传成功");
			Map<String,Object> resp = new HashMap<String,Object>();
			resp.put("status", "ok");
			resp.put("imgUrl", url);
			return resp;
		}
		
		Map<String,Object> resp = new HashMap<String,Object>();
		resp.put("status", "error");
		return resp;
		
	}

	
}
