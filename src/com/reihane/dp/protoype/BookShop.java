package com.reihane.dp.protoype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String name;
	private List<Book> books = new ArrayList<>();
	
	public void loadDate(){
		List<Book> books = new ArrayList<>();
		books.add(new Book("first","1"));
		books.add(new Book("second","2"));
		books.add(new Book("third","3"));
		
		this.books = books;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [name=" + name + ", books=" + books + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		//Shallow Copy -- not good
//		return super.clone();
		BookShop bs = new BookShop();
		for(Book b : this.books)
			bs.getBooks().add(b);
		
		return bs;
	}
	
}
