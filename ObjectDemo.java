package com.java.demo;
class Sample
{
	int num1;
	int num2;
	int result;
	
	public void display()
	{
		result = num1 + num2;
	}
}


public class ObjectDemo {
	
	public static void main (String[] args)
	{
		Sample obj = new Sample();
		obj.num1 = 5;
		obj.num2 = 3;
		
		System.out.println(obj.result);  // Garbage Collection (By Default the value is 0)
		
		obj.display();
		
		System.out.println(obj.result);
		
	}


}
