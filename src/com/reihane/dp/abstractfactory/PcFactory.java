package com.reihane.dp.abstractfactory;

public class PcFactory implements ComputerAbstractFactory {
	
	private Pc pc;
	
	
	public PcFactory(String ram, String hdd, String cpu) {
		super();
		this.pc = new Pc(ram, hdd, cpu);
	}


	@Override
	public Computer createComputer() {
		return pc;
	}

}
