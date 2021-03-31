package com.plete.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plete.entity.Item;
import com.plete.mapper.ItemMapper;

@Service("itemService")
public class ItemService implements IitemService {
	
	@Autowired
	private ItemMapper mapper;
	
	@Override
	public List<Item> itemList() {
		// TODO Auto-generated method stub
		return mapper.itemList();
	}

}
