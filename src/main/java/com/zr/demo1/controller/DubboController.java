package com.zr.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.zr.demo1.model.User;
import com.zr.demo1.service.UserService;

@RestController
public class DubboController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/d")
	public List<User> A() {
		return userService.findAllUsers();
	}

}
