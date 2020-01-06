package com.sample.demo;

class StaticClass
{
	static int marks;
	public String name;
	public int rollNo;
	
	static
	{
		System.out.println("Inside static block");
	}
	
	public void display()
	{
		static int i;
		System.out.println("Roll no. is " + rollNo + " Name is " + name + " Marks are "+ marks);
	}
	
}

public class StaticDemo {
	public static void main(String args[]) {
		
		StaticClass staticObj1 = new StaticClass();
		
		staticObj1.marks = 10;
		staticObj1.name = "Rahul";
		staticObj1.rollNo = 2;
		
		staticObj1.display();
		
        StaticClass staticObj2 = new StaticClass();
		
		staticObj2.marks = 20;
		staticObj2.name = "Mahesh";
		staticObj2.rollNo = 3;
		
		staticObj2.display();
		
		StaticClass.marks = 30;
		
		staticObj1.display();
		staticObj2.display();
		
		
		
		
		
		System.out.println();
	}
}
