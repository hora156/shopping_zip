package com.plete.mapper;

import java.util.List;

import com.plete.entity.Item;
import com.plete.model.request.ItemApiRequest;
import com.plete.model.request.MultiFileUploadRequest;

public interface ItemMapper {
	
	List<Item> itemList();
	
	Long uploadItem(ItemApiRequest req);
	
	void uploadMultiFile(MultiFileUploadRequest multi);
	
}
