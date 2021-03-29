package com.fruitsalesplatform.service;

import java.util.List;

import com.fruitsalesplatform.po.BaseModel;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.BookTypeInfo;
import com.fruitsalesplatform.po.ResBaseModel;

public interface BookService {
	
	BookInfo queryBookById(int id);
	
	ResBaseModel queryBooks(BaseModel param);
	
	int addBook(BookInfo bookInfo);
	
	int updateBook(BookInfo bookInfo);
	
	void deleteBook(int bookId);
	
	int addBookType(BookTypeInfo bookTypeInfo);
	
	List<BookTypeInfo> queryAllBookType(BookTypeInfo bookTypeInfo);
	
	int updateBookType(BookTypeInfo bookTypeInfo);
	
	void deleteBookType(int cId);
}
