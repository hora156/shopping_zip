package com.plete.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.plete.entity.Item;
import com.plete.mapper.ItemMapper;
import com.plete.model.request.ItemApiRequest;
import com.plete.util.UploadFileUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("itemService")
public class ItemService implements IitemService {
	
	@Autowired
	private ItemMapper mapper;
	
	@Override
	public List<Item> itemList() {
		// TODO Auto-generated method stub
		return mapper.itemList();
	}

	@Override
	public void uploadItem(ItemApiRequest req, String uploadPath) throws IOException {
		
		req.setTitle_img_upload(UploadFileUtils.uploadFile(uploadPath,
				req.getTitle_img().getOriginalFilename(),
				req.getTitle_img().getBytes()));
		
		List<String> list = new ArrayList<String>();
		for(MultipartFile file : req.getMulti_img()) {
			list.add(UploadFileUtils.uploadFileNoThum(uploadPath, file.getOriginalFilename(), file.getBytes()));
		}
		req.setMulti_img_upload(list);
		
		req.setStatus("REGISTERED");
		req.setCreated_by("admin");
		req.setUpdated_by("admin");
		
		mapper.uploadItem(req);
		
		log.info("{}", req.toString());
		
	}
	
	
	
	
	
	
	
	
	
}
