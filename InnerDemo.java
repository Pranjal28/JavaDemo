package com.java.demo;

class Outer
{
	static int num;
	
	public static void show()
	{
		System.out.println("In show");
	}
	
	class Inner
	{
		public void display()
		{
			System.out.println("In display");
		}
	}
	
	static class InnerClass
	{
		public void display()
		{
			System.out.println("In display");
		}
	}
}

public class InnerDemo {
	
	public static void main (String[] args)
	{
		
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner o = obj.new Inner();  //Outer class for inner class reference & outer class object for inner class object
		o.display();
		
		Outer.InnerClass oic = new Outer.InnerClass(); //static class neednot require object of outer class to be invoked
		
		
	}

}
