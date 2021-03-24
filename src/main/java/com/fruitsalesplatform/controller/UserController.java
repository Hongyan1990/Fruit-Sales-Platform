package com.fruitsalesplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fruitsalesplatform.po.UserInfo;
import com.fruitsalesplatform.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showinfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId) {
		UserInfo userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "user/showinfo";
	}
}
