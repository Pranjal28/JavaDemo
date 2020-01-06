package com.java.demo;

class StaticExample
{
	
	public void show()
	{
		System.out.println("In class StaticExample");
	}
	
	static class StaticSample {
		
		public void display()
		{
			System.out.println("In class StaticSample");
		}
		
		public static void staticmethod()
		{
			System.out.println("In method staticmethod");
		}
		
		static int i =5;
		
		static int num1;
		
		static
		{
			num1 = 10;
		}
		
	}
}

public class StaticClassDemo {
	
	public static void main (String[] args) {
		
		StaticExample obj  = new StaticExample();
		
		obj.show();
				
		StaticExample.StaticSample obj1 = new StaticExample.StaticSample();
		
		obj1.display();
		
		StaticExample.StaticSample.staticmethod();
		
		System.out.println("Value of i is " + StaticExample.StaticSample.i );
		System.out.println("Value of num1 is " + StaticExample.StaticSample.num1);
		
	}

}
