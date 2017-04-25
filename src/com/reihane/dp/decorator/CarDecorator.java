package com.reihane.dp.decorator;

public class CarDecorator extends Car {
	
	protected Car car;
	
	public CarDecorator(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
	}

}
