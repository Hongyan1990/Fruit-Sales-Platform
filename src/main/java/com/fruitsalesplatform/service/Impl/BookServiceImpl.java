package com.fruitsalesplatform.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitsalesplatform.dao.BookMapper;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;

	public BookInfo queryBookById(int id) {
		return bookMapper.queryBookById(id);
	}

	public List<Map<String, Object>> queryBooks(Map map) {
		return bookMapper.queryBooks(map);
	}

	
	
}
