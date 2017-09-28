package com.qpp.springmvc.service.impl;

import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.qpp.springmvc.service.ProjectService;
import com.qpp.springmvc.utils.ImgUtils;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public String uploadImg(String suffix, String filename, MultipartFile file) throws IllegalStateException, IOException {
		System.out.println("service上传文件"+suffix);
		if ("PNG".equals(suffix.toUpperCase()) || "JPG".equals(suffix.toUpperCase()) || "GIF".equals(suffix.toUpperCase())) {
			System.out.println("判断格式");
			
			String path = ImgUtils.genOutputFilename(suffix);
			System.out.println("图片上传路径："+path);
			File f = new File(path);
			f.getParentFile().mkdirs();
			file.transferTo(f);
			
			return path;
		}
		return "";
	}

}
