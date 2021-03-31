package com.plete.service;

import java.util.List;

import com.plete.entity.OrderDetail;
import com.plete.entity.OrderGroup;

public interface IorderService {

	List<OrderGroup> orderList();
	List<OrderDetail> detailList(Long id);
}
