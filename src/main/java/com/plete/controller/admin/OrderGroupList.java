package com.plete.controller.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plete.entity.OrderDetail;
import com.plete.entity.OrderGroup;
import com.plete.service.OrderService;
import com.plete.util.CrudInterface;
import com.plete.util.Header;

@RestController
@RequestMapping("/admin")
public class OrderGroupList implements CrudInterface<OrderDetail, OrderDetail> {

	@Resource(name = "orderService")
	OrderService service;
	
	@Override
	public Header<OrderDetail> create(Header<OrderDetail> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<OrderDetail> read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<OrderDetail> update(Header<OrderDetail> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("null")
	@RequestMapping("/orderList")
	public ModelAndView orderList(){
		
		ModelAndView model = new ModelAndView("/admin/content/orderList");
		
		List<OrderGroup> orderList = service.orderList();
		for(int i = 0; i < orderList.size(); i++) {
			orderList.get(i).setOrderDetailList(service.detailList(orderList.get(i).getId()));
			
		}
		
		model.addObject("order", Header.OK(orderList));
		
		return model;
	}
	
}


















