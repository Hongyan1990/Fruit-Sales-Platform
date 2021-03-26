package com.fruitsalesplatform.dao;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.BookInfo;

public interface BookInfoMapper {
	public BookInfo selectBookById(int id);
	public List<BookInfo> selectAllBooks(Map map);
}
