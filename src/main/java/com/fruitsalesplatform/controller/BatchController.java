package com.fruitsalesplatform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruitsalesplatform.po.BatchInfo;
import com.fruitsalesplatform.po.CarModel;
import com.fruitsalesplatform.service.BatchService;

@Controller
public class BatchController {
	@Autowired
	private BatchService batchService;
	
	// 根据购物车id查询图书
	@RequestMapping(value="/batch/{carId}", method= {RequestMethod.GET})
	@ResponseBody
	public List<Map<String, Object>> queryBatchInfoByCarId(ModelMap modelMap, @PathVariable int carId) {
		List<Map<String, Object>> batchs = batchService.queryBtachBook(carId);
		return batchs;
	}
	
	// 新增batch
	@RequestMapping(value="/batch", method= {RequestMethod.POST} )
	@ResponseBody
	public Map<String, Integer> addBatch(Model model, @RequestBody BatchInfo batchInfo) {
		batchService.addBatch(batchInfo);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("bookId", batchInfo.getBatchId());
		return map;
	}
	
	// 修改batch
	@RequestMapping(value="/batch", method= {RequestMethod.PUT})
	@ResponseBody
	public Map<String, Integer> editBatch(Model model, @RequestBody BatchInfo batchInfo) {
		int batchId = batchService.updateBatch(batchInfo);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("batchId", batchId);
		return map;
	}
	
	// 删除batch
	@RequestMapping(value="/batch/{batchId}", method= {RequestMethod.DELETE})
	@ResponseBody
	public Map<String, String> removeBatch(Model model, @PathVariable int batchId) {
		batchService.deleteBatch(batchId);
		Map<String, String> map = new HashMap<String, String>();
		map.put("state", "SUCCESS");
		return map;
	}
	
	@RequestMapping(value="/car/{uId}", method= {RequestMethod.GET})
	@ResponseBody
	public CarModel queryCar(Model model, @PathVariable int uId) {
		CarModel car = batchService.queryDoCar(uId);
		return car;
	}
}
