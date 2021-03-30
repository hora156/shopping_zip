package com.plete.service;

import java.util.List;

import com.plete.entity.OrderGroup;
import com.plete.entity.User;

public interface IuserService {
	User selectUser(Long id);
	List<User> userList();
	List<OrderGroup> orderList();
}
