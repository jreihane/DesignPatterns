package com.reihane.dp.abstractfactory;

public class AbstractFacoryExample {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PcFactory("aa", "bb", "cc"));
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("dd", "ee", "ff"));
		
		System.out.println(pc);
		System.out.println(server);

	}
	

}
