package com.java.demo;

class ParentClass
{
	
	int i;
	public void show()
	{
		System.out.println("Inside show of ParentClass");
		System.out.println("Value of i in ParentClass "+ i);
	}
	
	
}

class ChildClass extends ParentClass {
	
	
	@Override
	public void show()
	{
	
		System.out.println("Inside show of ChildClass");
	}
	
	public void config1()
	{
		
	}
	
}

public class OverridingDemo {
	
	public static void main (String[] args) {
		
		ChildClass obj = new ChildClass();
		
		obj.show();  //Dynamic method dispatch or runtime polymorphism
		
		obj.config1();
		
		
	}

}
