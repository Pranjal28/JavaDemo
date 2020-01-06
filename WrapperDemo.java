package com.java.demo;

public class WrapperDemo {
	
	@SuppressWarnings("deprecation")
	public static void main (String[] args)
	{
		int i=5; //Primitive Datatype
		
		Integer ii = new Integer(i);  //	Boxing -Wrapping .Integer used with frameworks like Hibernate
		int j = ii.intValue();        // Unboxing - Wrapping
		
		System.out.println(j);
		
		Integer k = i ;             //AutoBoxing
		int value= k;               //Autounboxing
		
		System.out.println(value);
	}

}
