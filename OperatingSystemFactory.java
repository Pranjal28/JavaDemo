package com.sample.design;

import com.phone.OS;

public class OperatingSystemFactory {
	
	public OS getInstance(String str)
	{
		if(str.equals("Open"))
		return new Android();
		else if(str.equals("Closed"))
			return new Ios();
		else
			return new Windows();
	}
}
