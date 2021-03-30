package com.fruitsalesplatform.po;

import java.util.List;
import java.util.Map;

public class ResBaseModel {
	private String state;
	private String msg = "";
	private Map<String, Object> pageination;
	private Map<String, Object> data;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getPageination() {
		return pageination;
	}
	public void setPageination(Map<String, Object> pageination) {
		this.pageination = pageination;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
}
