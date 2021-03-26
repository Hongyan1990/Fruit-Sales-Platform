package com.fruitsalesplatform.dao;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.BookInfo;

public interface BookMapper {
	BookInfo queryBookById(int id);
	List<Map<String, Object>> queryBooks(Map map);
}
