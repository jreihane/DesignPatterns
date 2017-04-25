package com.reihane.dp.protoype;

public class PrototypeExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bookShop1 = new BookShop();
		bookShop1.setName("bookShop1");
		bookShop1.loadDate();
		
		BookShop bookShop2 = bookShop1.clone();
		bookShop2.setName("bookShop2");
		
		bookShop1.getBooks().remove(1);
		
		System.out.println(bookShop1);
		System.out.println(bookShop2);
	}

}
