package com.qpp.springmvc.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ProjectService {

	String uploadImg(String suffix, String filename, MultipartFile file) throws IllegalStateException, IOException;

}
