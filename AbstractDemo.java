package com.java.demo;

abstract class AbstractExample          //Abstract class can't be instantiated
{
	abstract void example();           //Abstract method can only be declared in an abstract class
	
	public void display()
	{
		System.out.println("In display");
	}
}

abstract class Derived extends AbstractExample
{
	//abstract void example();
	abstract void derivedSample();
}

class AbstractChild extends Derived
{
	public void example()                //Child class of abstract class must define the abstract method
	                                     //otherwise that class also will be abstract
	{
		System.out.println("In example");
	}
	
	public void derivedSample()
	{
		
	}
}

public class AbstractDemo {
	
	public static void main (String[] args)
	{
		AbstractExample obj = new AbstractChild();
		
		obj.example();
	}

}
