package com.fruitsalesplatform.service;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.BookInfo;

public interface BookService {
	public BookInfo selectBookById(int id);
	public List<BookInfo> selectAllBooks(Map map);
}
