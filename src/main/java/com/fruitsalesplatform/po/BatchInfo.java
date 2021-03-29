package com.fruitsalesplatform.po;

public class BatchInfo {
	private int batchId;
	private int carId;
	private int bookId;
	private int count;
	private BookInfo book;
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public BookInfo getBook() {
		return book;
	}
	public void setBook(BookInfo book) {
		this.book = book;
	}
	
	
}
