package com.reihane.dp.decorator;

public class SportCar extends CarDecorator {

	public SportCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Sport Car!");
	}

}
