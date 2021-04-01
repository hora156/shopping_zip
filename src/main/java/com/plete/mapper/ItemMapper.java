package com.plete.mapper;

import java.util.List;

import com.plete.entity.Item;
import com.plete.model.request.ItemApiRequest;

public interface ItemMapper {
	
	List<Item> itemList();
	
	void uploadItem(ItemApiRequest req);
	
}
