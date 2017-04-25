package com.reihane.dp.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

	private Server server;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.server = new Server(ram, hdd, cpu);
	}

	@Override
	public Computer createComputer() {
		return server;
	}

}
