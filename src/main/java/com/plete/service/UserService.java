package com.plete.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plete.entity.OrderGroup;
import com.plete.entity.User;
import com.plete.mapper.UserMapper;

@Service("userService")
public class UserService implements IuserService {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public User selectUser(Long id) {
		
		return mapper.selectUser(id);
		
	}

	@Override
	public List<User> userList() {
		return mapper.userList();
	}


	
	
	
}
