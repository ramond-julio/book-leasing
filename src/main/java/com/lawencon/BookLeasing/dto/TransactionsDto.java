package com.lawencon.BookLeasing.dto;

import java.util.Date;

public class TransactionsDto {

	private Date startDate;
	private Date endDate;
	private int borrowTime;
	private int penaltiesTime;
	private int penalties;
	private int bookId;
	private int customerId;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(int borrowTime) {
		this.borrowTime = borrowTime;
	}
	public int getPenaltiesTime() {
		return penaltiesTime;
	}
	public void setPenaltiesTime(int bpenaltiesTime) {
		this.penaltiesTime = bpenaltiesTime;
	}
	public int getPenalties() {
		return penalties;
	}
	public void setPenalties(int bpenalties) {
		this.penalties = bpenalties;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
}
