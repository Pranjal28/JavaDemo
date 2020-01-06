package com.java.demo;
import java.lang.reflect.Constructor;

class Example
{
	int num1;
	
	public Example()
	{
		num1=5;
		System.out.println("In Default Constructor");
	}
	
	public Example(int n)
	{
		num1 = n;
	}
	
	public Example(int n, double d)
	{
		num1 = (int) d;
	}
}




public class ConstructorDemo {
	
	public static void main (String[] args) {
		
		Example obj = new Example(4,6.8); // obj is reference, and new allocates memory for Example() object
		
		
//		 If multiple constructors are present, then parametrised constructor will be exceuted, and control
//		will not go to default Constructor. When no constructor is there, default Constructor will be invoked automatically.
		
		System.out.println(obj.num1);
		
		
		
	}

}
