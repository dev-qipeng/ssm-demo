package com.qpp.springmvc.service;

import com.qpp.springmvc.dao.pojo.User;

public interface UserService {

	User getUser(int id);

	User getUser(String username, String password);


	
}
