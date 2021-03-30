package com.fruitsalesplatform.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruitsalesplatform.dao.OrderMapper;
import com.fruitsalesplatform.po.OrderModel;
import com.fruitsalesplatform.po.ResBaseModel;
import com.fruitsalesplatform.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderMapper orderMapper;
	private SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public ResBaseModel queryOrder(Map<String, Object> order) {
		Map<String, Object> data = new HashMap<String, Object>();
		ResBaseModel res = new ResBaseModel();
		List<OrderModel> list = orderMapper.queryOrder(order);
		data.put("list", list);
		res.setData(data);
		res.setState("SUCCESS");
		res.setState("00");
		return res;
	}

	public ResBaseModel addOrder(Map<String, Object> order) {
		Date date = new Date();
		Map<String, Object> data = new HashMap<String, Object>();
		ResBaseModel res = new ResBaseModel();
		order.put("createTime", date);
		order.put("updateTime", date);
		int id = orderMapper.addOrder(order);
		data.put("orderId", id);
		res.setData(data);
		res.setMsg("SUCCESS");
		res.setState("00");
		return res;
	}

	public ResBaseModel updateOrder(Map<String, Object> order) {
		Date date = new Date();
		Map<String, Object> data = new HashMap<String, Object>();
		ResBaseModel res = new ResBaseModel();
		order.put("updateTime", date);
		int id = orderMapper.updateOrder(order);
		data.put("orderId", id);
		res.setData(data);
		res.setMsg("SUCCESS");
		res.setState("00");
		return res;
	}

}
