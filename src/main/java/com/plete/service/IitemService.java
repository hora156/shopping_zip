package com.plete.service;

import java.io.IOException;
import java.util.List;

import com.plete.entity.Item;
import com.plete.model.request.ItemApiRequest;
import com.plete.util.Pagination;

public interface IitemService {
	List<Item> itemList(Pagination pagination);
	
	Long uploadItem(ItemApiRequest req, String uploadPath) throws IOException;
	
	int tableCount();
}
