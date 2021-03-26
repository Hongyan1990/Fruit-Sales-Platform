package com.fruitsalesplatform.service;

import com.fruitsalesplatform.po.UserInfo;

public interface UserService {
	UserInfo getUserById(int uid);
	int addUser(UserInfo userInfo);
	void updateUser(UserInfo userInfo);
}
