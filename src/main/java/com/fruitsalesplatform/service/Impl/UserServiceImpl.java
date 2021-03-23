package com.fruitsalesplatform.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitsalesplatform.dao.UserInfoMapper;
import com.fruitsalesplatform.po.UserInfo;
import com.fruitsalesplatform.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserById(int uid) {
		return userInfoMapper.selectUserById(uid);
	}

}
