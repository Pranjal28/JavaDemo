package com.java.demo;

class ThisExample
{
	
	int num1;
	int num2;
	
	public ThisExample() {
		System.out.println("Hello World");
	}
	
	public ThisExample(int num1, int num2)
	{
		this.num1=num1; // this refers to the current object here, if we remove this, num1 will take local variable value of num1, i.e. 0
		                // using this keyword, num1 takes instance variable value of num1, i.e., 4
		this.num2=num2; // Same explanation for num2 also
	}
	
}

public class ThisDemo {
	
public static void main(String []args) {
		
	ThisExample obj = new ThisExample(4,3);
	
	System.out.println(obj.num1);
	System.out.println(obj.num2);

	}

}
