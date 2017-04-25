package com.reihane.dp.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	void paintColor() {
		System.out.print("Now Circle Color is: ");
		this.color.applyColor();
	}

}
