package com.reihane.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> components = new ArrayList<>();
	private String name;
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void showPrice() {
		System.out.println("name: " + name);
		for(Component com : components)
			com.showPrice();
	}
	
	public void addComponent(Component c) {
		components.add(c);
	}
	
	public List<Component> getComponents() {
		return components;
	}
	public void setComponents(List<Component> components) {
		this.components = components;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
