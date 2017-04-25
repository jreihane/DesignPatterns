package com.reihane.dp.bridge;

public class BridgeExample {

	public static void main(String[] args) {
		Shape rec = new Rectangle(new RedColor());
		rec.paintColor();
		
		Shape cir = new Circle(new GreenColor());
		cir.paintColor();
	}

}
