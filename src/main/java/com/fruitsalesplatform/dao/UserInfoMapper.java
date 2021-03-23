package com.fruitsalesplatform.dao;

import com.fruitsalesplatform.po.UserInfo;

public interface UserInfoMapper {
	UserInfo selectUserById(int uid);
}
