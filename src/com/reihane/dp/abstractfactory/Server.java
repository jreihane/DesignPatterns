package com.reihane.dp.abstractfactory;

public class Server extends Computer {
	private String ram;
    private String hdd;
    private String cpu;

	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	public String getRAM() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHDD() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getCPU() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
}
