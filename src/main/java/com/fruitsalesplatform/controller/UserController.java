package com.fruitsalesplatform.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fruitsalesplatform.po.UserInfo;
import com.fruitsalesplatform.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/{userId}", method= {RequestMethod.GET})
	@ResponseBody
	public UserInfo showUserInfo(ModelMap modelMap, @PathVariable int userId) {
		UserInfo userInfo = userService.getUserById(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return userInfo;
	}
	
	@RequestMapping(value="/add", method= {RequestMethod.POST})
	@ResponseBody
	public Map<String, Integer> addUserInfo(ModelMap modelMap, @RequestBody UserInfo userInfo) {
		int uid = userService.addUser(userInfo);
		System.out.println(uid);
		Map<String, Integer> res = new HashMap<String, Integer>();
		res.put("id", uid);
		System.out.println(JSON.toJSON(res));
		return res;
	}
	
	@RequestMapping(value="/edit", method= {RequestMethod.POST}) 
	@ResponseBody
	public String editUserInfo(Model model, @RequestBody UserInfo userInfo){
		userService.updateUser(userInfo);
		Map<String, String> res = new HashMap<String, String>();
		res.put("state", "SUCCESS");
		return "SUCCESS";
	}
}
