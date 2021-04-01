package com.plete.controller.admin;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plete.entity.Item;
import com.plete.model.request.ItemApiRequest;
import com.plete.service.ItemService;
import com.plete.util.Header;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/admin")
public class ItemController  {
	
	@Resource(name = "itemService")
	ItemService service;
	
	@ResponseBody
	@PostMapping("/uploadItem")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String create(ItemApiRequest req,
			HttpServletRequest request) throws IOException {
		log.info("{}", req.toString());
		log.info("{}", req.getTitle_img().getSize());
		log.info("{}", req.getMulti_img().toString());
		String uploadPath = request.getSession().getServletContext().getRealPath("\\") + "\\resources\\upload\\";
		service.uploadItem(req, uploadPath);
		return "redirect:/itemList";
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
