package com.fruitsalesplatform.dao;

import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.UserInfo;

public interface UserInfoMapper {
	UserInfo selectUserById(int uid);
	int addUser(UserInfo userInfo);
	void updateUser(UserInfo userInfo);
//	BookInfo queryBookById(int id);
}
