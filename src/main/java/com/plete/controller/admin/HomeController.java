package com.plete.controller.admin;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plete.entity.User;
import com.plete.service.UserService;
import com.plete.util.CrudInterface;
import com.plete.util.Header;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/admin")
public class HomeController {
	 
	@Resource(name = "userService")
	UserService service;

	@RequestMapping(value = "/home")
	public ModelAndView adminPage() {
		
		ModelAndView model = new ModelAndView("admin/home");
		
		return model;
	}
	
}
