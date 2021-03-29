package com.fruitsalesplatform.po;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderModel {
	private int orderId;
	private int userId;
	private int carId;
	private int state;
	private Date createTime;
	private Date updateTime;
	private float total;
	private UserInfo user;
	private List<Map<String, Object>> books;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public List<Map<String, Object>> getBooks() {
		return books;
	}
	public void setBooks(List<Map<String, Object>> books) {
		this.books = books;
	}
	
	
	
}
