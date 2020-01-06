package com.java.example;

interface AbcExample
{
	void show();
}
public class InterfaceLambdaDemo {
	
	public static void main (String args[])
	{
		Abc obj = () -> System.out.println("I'm the best");
		
		obj.show();
	}

}
