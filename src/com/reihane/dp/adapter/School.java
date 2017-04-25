package com.reihane.dp.adapter;

public class School {

	public static void main(String[] args) {
		
		
		PenAdapter pa = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(pa);
		aw.writeAssignment("salam");
	}

}
