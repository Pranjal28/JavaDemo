package com.java.example;

interface I1
{
	
	int i =8;
	default void show()
	{
		System.out.println("In default of interface");
	}
	
	static void display()
	{
		System.out.println("In Interface");
	}
	
	public int example();
	
	
}

class Parent1 implements I1
{
	public  int example()
	{
		System.out.println("In example of Parent1");
		return 1;
	} 

}

class Child1 extends Parent1
{
	
	public int example()
	{
		System.out.println("In example of Child1");
		return 2;
	}
}

class Child2 extends Child1
{
	public int example()
	{
		//.super.example();
		
		super.example();
		System.out.println("In example of Child2");
		return 3;
	}
	
	
}
public class InterfaceJava8{
	
	public static void main (String args[])
	{
		I1 obj = new Child2();
		
		obj.example();
		
		System.out.println(obj.i);
		
	
	}

}
