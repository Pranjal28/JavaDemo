package com.java.example;

interface Example1
{
	default void show()
	{
		System.out.println("In show of Example1");
	}
}

interface Example2
{
	default void show()
	{
		System.out.println("In show of Example2");
	}
}

class SuperInterface implements Example1,Example2
{
	@Override
	public void show()
	{
		Example1.super.show();
		Example2.super.show();
	}
}

public class SuperInterfaceDemo {
	
	public static void main (String args[])
	{
	    Example1 obj = new SuperInterface();
	    obj.show();
	    
	}

}
