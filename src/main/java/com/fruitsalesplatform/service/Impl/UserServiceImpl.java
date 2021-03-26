package com.fruitsalesplatform.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitsalesplatform.dao.UserInfoMapper;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.UserInfo;
import com.fruitsalesplatform.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserById(int uid) {
		return userInfoMapper.selectUserById(uid);
	}
	
	public int addUser(UserInfo userInfo) {
		userInfoMapper.addUser(userInfo);
		return userInfo.getUid();
	}
	
	public void updateUser(UserInfo userInfo) {
		userInfoMapper.updateUser(userInfo);
	}

//	public BookInfo queryBookById(int id) {
//		
//		return userInfoMapper.queryBookById(id);
//	}
	
	

}
