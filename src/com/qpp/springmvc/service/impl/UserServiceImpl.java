package com.qpp.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qpp.springmvc.dao.mapper.UserMapper;
import com.qpp.springmvc.dao.pojo.User;
import com.qpp.springmvc.dao.pojo.UserExample;
import com.qpp.springmvc.dao.pojo.UserExample.Criteria;
import com.qpp.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;

	@Override
	public User getUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User getUser(String username, String password) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		List<User> userList = userMapper.selectByExample(example);
		if(userList == null || userList.size() == 0){
			return null;
		}
		return userList.get(0);
	}
	

}
