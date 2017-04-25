package com.reihane.dp.decorator;

public class DecoratorExample {

	public static void main(String[] args) {
		
		Car lux = new CarDecorator(new LuxuryCar(new BasicCar()));
		lux.assemble();
		
		System.out.println("-----------------------");
		
		Car basic = new CarDecorator(new BasicCar());
		basic.assemble();
		
		System.out.println("-----------------------");

		Car sport = new CarDecorator(new SportCar(new BasicCar()));
		sport.assemble();

		System.out.println("-----------------------");

		Car lux2 = new CarDecorator(new LuxuryCar(new SportCar(new BasicCar())));
		lux2.assemble();
	}
	

}
