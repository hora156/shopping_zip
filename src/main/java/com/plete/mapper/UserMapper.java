package com.plete.mapper;

import java.util.List;

import com.plete.entity.OrderGroup;
import com.plete.entity.User;

public interface UserMapper {
	
	User selectUser(Long id);
	
	List<User> userList();
	
}
