package com.reihane.dp.template;

public abstract class HouseTemplate {

	public HouseTemplate() {}
	
	public final void buildHouse() {
		buildFoundation();
		buildRoof();
		buildWalls();
		buildWindows();
	}
	
	public abstract void buildRoof();
	
	public abstract void buildWalls();
	
	public abstract void buildFoundation();
	
	//default implementation
	private void buildWindows() {
		System.out.println("Building Base Windows");
	}

}
