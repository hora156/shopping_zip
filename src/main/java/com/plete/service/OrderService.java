package com.plete.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plete.entity.OrderDetail;
import com.plete.entity.OrderGroup;
import com.plete.mapper.OrderMapper;

@Service("orderService")
public class OrderService implements IorderService {

	@Autowired
	OrderMapper mapper;
	
	@Override
	public List<OrderGroup> orderList() {
		return mapper.orderList();
	}

	@Override
	public List<OrderDetail> detailList(Long id) {
		return mapper.detailList(id);
	}

	
	
}
