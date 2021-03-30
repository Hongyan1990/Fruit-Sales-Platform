package com.fruitsalesplatform.service;

import java.util.List;
import java.util.Map;

import com.fruitsalesplatform.po.OrderModel;
import com.fruitsalesplatform.po.ResBaseModel;

public interface OrderService {
	ResBaseModel queryOrder(Map<String, Object> order);
	ResBaseModel addOrder(Map<String, Object> order);
	ResBaseModel updateOrder(Map<String, Object> order);
}
