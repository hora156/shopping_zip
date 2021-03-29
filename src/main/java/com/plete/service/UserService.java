package com.plete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plete.entity.User;
import com.plete.mapper.UserMapper;

@Service("userService")
public class UserService implements IuserService {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public User selectUser(String id) {
		
		return mapper.selectUser(id);
		
	}
	
}
