package com.fruitsalesplatform.po;

public class BaseModel {
	private int cId;
	private int pageNo = 0;
	private int pageSize = 10;
	private int startNum;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = this.getPageNo() > 0 ? (this.getPageNo() - 1) * this.getPageSize() : 0;
	}
	
	
}
