package com.qpp.springmvc.controller;

import java.io.File;
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

import com.qpp.springmvc.service.ProjectService;

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
		String filename = file.getOriginalFilename();
		String suffix = getExtName(filename);
		
		String url = projectService.uploadImg(suffix,filename,file);
		
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

	private String upload(String suffix, String filename, MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println("上传文件"+suffix);
		if ("PNG".equals(suffix.toUpperCase()) || "JPG".equals(suffix.toUpperCase()) || "GIF".equals(suffix.toUpperCase())) {
			System.out.println("判断格式");
			String realPath = request.getSession().getServletContext().getRealPath("/");
			String trueFileName = String.valueOf(System.currentTimeMillis())+filename;
			
			String path = realPath+trueFileName;
			System.out.println("图片上传路径："+path);
			
			file.transferTo(new File(path));
			
			return path;
		}
		return "";
	}

	private String getExtName(String filename) {
		System.out.println("获取后缀名");
		int idx = filename.lastIndexOf(".");
		String suffix = null;
		if(idx > 0){
			suffix = filename.substring(idx+1);
			return suffix;
		}else{
			return "";
		}
	}
}
