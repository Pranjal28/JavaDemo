package com.java.demo;

class GrandParent
{
	public GrandParent()
	{
		System.out.println("Inside GrandParent's constructor");
	}
	
	public GrandParent(int i)
	{
		System.out.println("GrandParent's Parametrized constructor "+i);
	}
	
	public void show()
	{
		System.out.println("Inside show() of GrandParent");
	}
}

class Parent extends GrandParent
{
	public Parent()
	{
		System.out.println("Inside Parent's constructor");
	}
	
	public Parent(int i)
	{
		super(i);
		System.out.println("Parent's Parametrized constructor "+i);
	}
	
	public void show()
	{
		System.out.println("Inside show() of Parent");
	}
	
}

class Child extends Parent
{
	public Child()
	{
		System.out.println("Inside Child's constructor");
	}
	
	public Child(int i)
	{
		super(i);
		System.out.println("Child's Parametrized constructor "+i);
	}
	
	public void show()
	{
		System.out.println("Inside show() of Child");
	}
}

public class MultiInheritanceDemo {
	
	public static void main (String[] args) {
		
		Child objC = new Child(4);
		
		//GrandParent objC = new Child();
		
		//GrandParent obj = new Child();
		
		//obj.show();		
		
	}

}
