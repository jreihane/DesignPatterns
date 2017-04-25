package com.reihane.dp.bridge;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	abstract void paintColor();
}
