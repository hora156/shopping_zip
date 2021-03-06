package com.plete.controller.admin;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.plete.entity.OrderGroup;
import com.plete.entity.User;
import com.plete.service.UserService;
import com.plete.util.CrudInterface;
import com.plete.util.Header;

@RestController
@RequestMapping("/admin")
public class ClientUserController implements CrudInterface<User, User> {

	@Resource(name = "userService")
	UserService service;

	@Override
	@PostMapping("")
	public Header<User> create(@RequestBody Header<User> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("{id}")
	public Header<User> read(@PathVariable Long id) {
		
		return Header.OK(service.selectUser(id));
	}

	@Override
	@PutMapping("")
	public Header<User> update(@RequestBody Header<User> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@DeleteMapping("{id}")
	public Header delete(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping("/userList")
	public ModelAndView userList(){
		
		ModelAndView model = new ModelAndView("/admin/content/userList");
//		mo.addAttribute("user", service.userList());
		model.addObject("user", Header.OK(service.userList()));
		
		return model;
	}
	


}
