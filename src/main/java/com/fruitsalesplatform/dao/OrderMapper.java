package com.fruitsalesplatform.dao;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.OrderModel;

public interface OrderMapper {
	List<OrderModel> queryOrder(Map<String, Object> order);
	int addOrder(Map<String, Object> order);
	int updateOrder(Map<String, Object> order);
}
