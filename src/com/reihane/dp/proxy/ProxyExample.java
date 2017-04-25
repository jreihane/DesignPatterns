package com.reihane.dp.proxy;

public class ProxyExample {

	public static void main(String[] args) throws Exception {
		CommandExecutor c = new CommandExecutorProxy("Admin2", "123");
		
		c.executeCommand("rmertertret");

	}

}
