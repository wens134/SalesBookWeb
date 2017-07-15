package com.spinel.hr.base.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spinel.hr.base.domain.User;
import com.spinel.hr.base.service.UserService;

@Controller
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	@ResponseBody
	public User insert(@RequestBody User user){
		return userService.registerUser(user);
	}
	
	@RequestMapping(value="updateCurrentUser",method=RequestMethod.POST)
	@ResponseBody
	public User updateCurrentUser(@RequestBody User user){
		user = userService.updateCurrentUser(user);
		return user;
	}
	
	@RequestMapping(value="getCurrentUser")
	@ResponseBody
	public User getCurrentUser(){
		return userService.getCurrentUser();
	}
	
	@PostConstruct
	public void createAdminUser(){
		User admin = userService.findByUserName("admin");
		if(admin==null){
			admin = new User();
			admin.setFirstName("Administrator");
			admin.setUsername("admin");
			admin.setPassword("password");
			userService.registerUser(admin);
		}
	}
	
}
