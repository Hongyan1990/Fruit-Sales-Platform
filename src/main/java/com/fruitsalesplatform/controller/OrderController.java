package com.fruitsalesplatform.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitsalesplatform.po.BookInfo;
import com.fruitsalesplatform.po.ResBaseModel;
import com.fruitsalesplatform.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	// 根据用户id查询订单
	@RequestMapping(value="/order", method= {RequestMethod.GET})
	@ResponseBody
	public ResBaseModel queryOrderInfo(@RequestParam Map<String, Object> param) {
		ResBaseModel orders = orderService.queryOrder(param);
		return orders;
	}
	
	// 新增订单
	@RequestMapping(value="/order", method= {RequestMethod.POST})
	@ResponseBody
	public ResBaseModel addOrderInfo(Model model, @RequestBody Map<String, Object> orderInfo) {
		ResBaseModel orders = orderService.addOrder(orderInfo);
		return orders;
	}
	
	// 更新订单
	@RequestMapping(value="/order", method= {RequestMethod.PUT})
	@ResponseBody
	public ResBaseModel editOrderInfo(Model model, @RequestBody Map<String, Object> orderInfo) {
		ResBaseModel orders = orderService.updateOrder(orderInfo);
		return orders;
	}
}
