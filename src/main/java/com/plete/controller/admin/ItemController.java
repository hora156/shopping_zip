package com.plete.controller.admin;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plete.entity.Item;
import com.plete.service.ItemService;
import com.plete.util.CrudInterface;
import com.plete.util.Header;

@RestController
@RequestMapping("/admin")
public class ItemController implements CrudInterface<Item, Item> {
	
	@Resource(name = "itemService")
	ItemService service;
	
	@Override
	public Header<Item> create(Header<Item> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<Item> read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<Item> update(Header<Item> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping("/itemList")
	public ModelAndView itemList() {
		
		ModelAndView model = new ModelAndView("/admin/content/itemList");
		model.addObject("item", Header.OK(service.itemList()));
		
		return model;
		
	}

	@RequestMapping("/itemDetail")
	public ModelAndView itemDetail() {
		
		ModelAndView model = new ModelAndView("/admin/content/itemDetail");
		
		
		return model;
		
	}
	
}
