package com.fruitsalesplatform.service;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.BookInfo;

public interface BookService {
	BookInfo queryBookById(int id);
	List<Map<String, Object>> queryBooks(Map map);
}
