package com.reihane.dp.factory;

import com.reihane.dp.factory.phone.OS;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory op = new OperatingSystemFactory();
		
		OS s = op.getInstance("Close");
		s.specs();
	}

}
