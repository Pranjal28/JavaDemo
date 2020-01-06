package com.sample.design;

import com.phone.OS;

public class FactoryPattern {
	public static void main(String args[]) {
		
		//OS obj = new Windows();
		OperatingSystemFactory osf = new OperatingSystemFactory();  //Factory manufactures an object. Does not change client application
		// but only Factory class
		
		OS obj = osf.getInstance("Closed");
		obj.spec();
		System.out.println();
	}
}
