package com.plete.controller.admin;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.plete.entity.Item;
import com.plete.model.response.ItemApiResponse;
import com.plete.service.ItemService;
import com.plete.util.CrudInterface;
import com.plete.util.Header;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/admin")
public class ItemController  {
	
	@Resource(name = "itemService")
	ItemService service;
	
	
	@PostMapping("/uploadItem")
	@ResponseBody
	public Header<Item> create(HttpServletRequest session, MultipartHttpServletRequest mtf) {
		log.info("{}", session.getParameter("name"));
		log.info("{}", mtf.getFile("multi_img"));
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
