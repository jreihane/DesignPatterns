package com.reihane.dp.factory;

import com.reihane.dp.factory.phone.Android;
import com.reihane.dp.factory.phone.Ios;
import com.reihane.dp.factory.phone.OS;
import com.reihane.dp.factory.phone.Windows;

public class OperatingSystemFactory {

	public OS getInstance(String osType) {
		if("Open".equals(osType))
			return new Android();
		else if("Close".equals(osType))
			return new Ios();
		else
			return new Windows();
	}
}
