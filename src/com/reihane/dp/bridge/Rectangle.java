package com.reihane.dp.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	void paintColor() {
		System.out.print("Now Rectangle Color is: ");
		this.color.applyColor();
	}

}
