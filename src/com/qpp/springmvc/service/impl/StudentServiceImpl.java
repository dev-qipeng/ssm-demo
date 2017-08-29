package com.qpp.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qpp.springmvc.dao.mapper.StudentMapper;
import com.qpp.springmvc.dao.pojo.Student;
import com.qpp.springmvc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentMapper studentMapper;
	
	public Student getStudentById(int id){
		return studentMapper.selectByPrimaryKey(id);
	}
}
