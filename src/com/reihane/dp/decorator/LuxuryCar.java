package com.reihane.dp.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Luxury Car");
	}
}
