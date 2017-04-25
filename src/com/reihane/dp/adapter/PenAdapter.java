package com.reihane.dp.adapter;

public class PenAdapter implements Pen {

	PilotMarker pm = new PilotMarker();
	
	@Override
	public void write(String str) {
		pm.mark(str);
	}

}
