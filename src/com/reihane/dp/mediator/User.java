package com.reihane.dp.mediator;

public abstract class User {
	
	protected ChatMediator chatMediator;
	protected String username;
	
	public User(ChatMediator med, String name){
		this.chatMediator=med;
		this.username=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);

}
