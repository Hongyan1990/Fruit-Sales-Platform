package com.fruitsalesplatform.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitsalesplatform.dao.BookInfoMapper;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookInfoMapper bookInfoMapper;

	public BookInfo selectBookById(int id) {
		BookInfo bookInfo = bookInfoMapper.selectBookById(id);
		return bookInfo;
	}

	public List<BookInfo> selectAllBooks(Map map) {
		List<BookInfo> books = bookInfoMapper.selectAllBooks(map);
		return books;
	}

}
