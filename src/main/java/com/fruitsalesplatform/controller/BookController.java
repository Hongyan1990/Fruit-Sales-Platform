package com.fruitsalesplatform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book/{bid}", method= {RequestMethod.GET})
	@ResponseBody
	public BookInfo queryBookById(ModelMap modelMap, @PathVariable int bid) {
		BookInfo bookInfo = bookService.selectBookById(bid);
		return bookInfo;
	}
	
	@RequestMapping(value="/books", method= {RequestMethod.GET})
	@ResponseBody
	public List<BookInfo> queryBooks(ModelMap modelMap) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookid", null);
		List<BookInfo> books = bookService.selectAllBooks(map);
		return books;
	}
	
	@RequestMapping(value="/books/{tid}", method= {RequestMethod.GET})
	@ResponseBody
	public List<BookInfo> queryBooks(ModelMap modelMap, @PathVariable int tid) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookid", tid);
		List<BookInfo> books = bookService.selectAllBooks(map);
		return books;
	}
}
