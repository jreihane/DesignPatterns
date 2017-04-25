package com.reihane.dp.composite;

public class CompositeExample {

	public static void main(String[] args) {
		Component c1 = new Leaf(2000, "c1");
		Component c2 = new Leaf(500, "c2");
		Component c3 = new Leaf(1000, "c3");
		Component c4 = new Leaf(2040, "c4");
		
		Composite cc1 = new Composite("cc1");
		cc1.addComponent(c3);
		
		Composite cc = new Composite("cc");
		cc.addComponent(c1);
		cc.addComponent(c2);
		cc.addComponent(c4);
		cc.addComponent(cc1);
		
		cc.showPrice();
	}

}
