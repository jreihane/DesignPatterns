package com.reihane.dp.builder;

public class PersonBuilder {
	
	private Person person;
	
	public PersonBuilder(){
		this.person = new Person();
	}
	
	public PersonBuilder setName(String name) {
		this.person.setName(name);
		return this;
	}
	
	public PersonBuilder setId(long id) {
		this.person.setId(id);
		return this;
	}
	
	public PersonBuilder setGender(String gender) {
		this.person.setGender(gender);
		return this;
	}
	
	public Person build(){
		return this.person;
	}

}
