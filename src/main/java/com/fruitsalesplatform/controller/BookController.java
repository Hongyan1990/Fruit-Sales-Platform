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
	public BookInfo queryBookInfo(ModelMap modelMap, @PathVariable int bid) {
		BookInfo book = bookService.queryBookById(bid);
		return book;
	}
	
	@RequestMapping(value="/books", method= {RequestMethod.GET})
	@ResponseBody
	public List<Map<String, Object>> queryBooks(ModelMap modelMap) {
		Map map = null;
		List<Map<String, Object>> books = bookService.queryBooks(map);
		return books;
	}
	
	@RequestMapping(value="/books/{cid}", method= {RequestMethod.GET})
	@ResponseBody
	public List<Map<String, Object>> queryBooksByCid(ModelMap modelMap, @PathVariable int cid) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("cid", cid);
		List<Map<String, Object>> books = bookService.queryBooks(map);
		return books;
	}
}
