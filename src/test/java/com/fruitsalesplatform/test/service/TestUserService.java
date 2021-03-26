package com.fruitsalesplatform.test.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.UserInfo;
import com.fruitsalesplatform.service.BookService;
import com.fruitsalesplatform.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserService {
	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);
 
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;
	
	@Test
	public void testQueryById1() {
		UserInfo userInfo = userService.getUserById(6);
		BookInfo book = bookService.selectBookById(1);
		System.out.println(book.getBookName());
		LOGGER.info(JSON.toJSON(userInfo));
	}
	
}
