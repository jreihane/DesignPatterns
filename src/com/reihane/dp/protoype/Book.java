package com.reihane.dp.protoype;

public class Book {
	
	private String name;
	private String bid;
	
	public Book(String name, String bid) {
		super();
		this.name = name;
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", bid=" + bid + "]";
	}

}
