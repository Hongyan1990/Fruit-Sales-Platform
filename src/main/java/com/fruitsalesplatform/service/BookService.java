package com.fruitsalesplatform.service;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.BaseModel;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.BookTypeInfo;

public interface BookService {
	
	BookInfo queryBookById(int id);
	
	List<Map<String, Object>> queryBooks(BaseModel param);
	
	int addBook(BookInfo bookInfo);
	
	int updateBook(BookInfo bookInfo);
	
	void deleteBook(int bookId);
	
	int addBookType(BookTypeInfo bookTypeInfo);
	
	List<BookTypeInfo> queryAllBookType(BookTypeInfo bookTypeInfo);
	
	int updateBookType(BookTypeInfo bookTypeInfo);
	
	void deleteBookType(int cId);
}
