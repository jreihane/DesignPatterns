package com.reihane.dp.mediator;

public class UserImpl extends User {
	
	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg){
		System.out.println(this.username+": Sending Message="+msg);
		chatMediator.sendMessage(msg, this);
	}
	@Override
	public void receive(String msg) {
		System.out.println(this.username+": Received Message:"+msg);
	}
}
