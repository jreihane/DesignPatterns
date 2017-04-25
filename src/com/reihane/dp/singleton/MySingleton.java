package com.reihane.dp.singleton;

public class MySingleton {
	
	private MySingleton(){}
	
	private static class innerSingletonClass {
		private static final MySingleton INSTANCE = new MySingleton();
	}
	
	public static MySingleton getInstance(){
		return innerSingletonClass.INSTANCE;
	}

}
