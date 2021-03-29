package com.fruitsalesplatform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitsalesplatform.po.BaseModel;
import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.BookTypeInfo;
import com.fruitsalesplatform.po.ResBaseModel;
import com.fruitsalesplatform.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
    // 根据id查询图书
	@RequestMapping(value="/book/{bid}", method= {RequestMethod.GET})
	@ResponseBody
	public BookInfo queryBookInfo(ModelMap modelMap, @PathVariable int bid) {
		BookInfo book = bookService.queryBookById(bid);
		return book;
	}
	// 查询所有图书
	@RequestMapping(value="/books", method= {RequestMethod.GET})
	@ResponseBody
	public ResBaseModel queryBooks(@ModelAttribute("param") BaseModel param) {
		System.out.println("cId="+ param.getcId() + ", pageNo=" + param.getPageNo() + ", pageSize=" + param.getPageSize() + ", pageStart="+param.getStartNum());
		ResBaseModel res = bookService.queryBooks(param);
		return res;
	}
	// 根据类别查询图书
//	@RequestMapping(value="/books/{cid}", method= {RequestMethod.GET})
//	@ResponseBody
//	public List<Map<String, Object>> queryBooksByCid(ModelMap modelMap, @PathVariable int cid) {
//		BaseModel param = new BaseModel();
//		param.setcId(cid);
//		List<Map<String, Object>> books = bookService.queryBooks(param);
//		return books;
//	}
	// 新增图书
	@RequestMapping(value="/book", method= {RequestMethod.POST} )
	@ResponseBody
	public Map<String, Integer> addBook(Model model, @RequestBody BookInfo bookInfo) {
		bookService.addBook(bookInfo);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookId", bookInfo.getBookId());
		return map;
	}
	// 修改图书
	@RequestMapping(value="/book", method= {RequestMethod.PUT})
	@ResponseBody
	public Map<String, Integer> editBook(Model model, @RequestBody BookInfo bookInfo) {
		int bookId = bookService.updateBook(bookInfo);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookId", bookId);
		return map;
	}
	// 删除图书
	@RequestMapping(value="/book/{bookId}", method= {RequestMethod.DELETE})
	@ResponseBody
	public Map<String, String> editBook(Model model, @PathVariable int bookId) {
		bookService.deleteBook(bookId);
		Map<String, String> map = new HashMap<String, String>();
		map.put("state", "SUCCESS");
		return map;
	}
	
	// 新增图书类别
	@RequestMapping(value="/booktype", method= {RequestMethod.POST} )
	@ResponseBody
	public Map<String, Integer> addBookType(Model model, @RequestBody BookTypeInfo bookTypeInfo) {
		bookService.addBookType(bookTypeInfo);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookId", bookTypeInfo.getcId());
		return map;
	}
	
	// 查询所有图书
	@RequestMapping(value="/booktypes", method= {RequestMethod.GET})
	@ResponseBody
	public List<BookTypeInfo> queryBookTypes(ModelMap modelMap, @RequestParam BookTypeInfo bookTypeInfo) {
		List<BookTypeInfo> books = bookService.queryAllBookType(bookTypeInfo);
		return books;
	}
	
	// 修改图书类别
	@RequestMapping(value="/booktype", method= {RequestMethod.PUT})
	@ResponseBody
	public Map<String, Integer> editBookType(Model model, @RequestBody BookTypeInfo bookTypeInfo) {
		int cId = bookService.updateBookType(bookTypeInfo);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("cId", cId);
		return map;
	}
}
