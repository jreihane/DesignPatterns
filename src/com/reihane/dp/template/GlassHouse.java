package com.reihane.dp.template;

public class GlassHouse extends HouseTemplate {
	
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildRoof() {
		System.out.println("Building roof with Glass coating");
	}

	@Override
	public void buildFoundation() {
		System.out.println("Building foundation with Glass coating");
	}
}
