package com.reihane.dp.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildRoof() {
		System.out.println("Building roof with Wood coating");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building foundation with Wood coating");
	}

}
