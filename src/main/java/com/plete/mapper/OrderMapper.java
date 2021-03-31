package com.plete.mapper;

import java.util.List;

import com.plete.entity.OrderDetail;
import com.plete.entity.OrderGroup;

public interface OrderMapper {
	List<OrderGroup> orderList();
	List<OrderDetail> detailList(Long id);
}
