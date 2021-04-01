package com.plete.service;

import java.io.IOException;
import java.util.List;

import com.plete.entity.Item;
import com.plete.model.request.ItemApiRequest;

public interface IitemService {
	List<Item> itemList();
	
	Long uploadItem(ItemApiRequest req, String uploadPath) throws IOException;
}
