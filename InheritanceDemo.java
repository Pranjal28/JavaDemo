package com.java.demo;

class A
{
	public void calculate(int a, int b) {
		
		int c = a+b;
		System.out.println("In class A " +c);
	}
	
	public void calc(int a, int b) {
		
		int c = a*b;
		System.out.println("In class A" + c);
	}
}

class B extends A
{
	
	public void calculate(int a, int b) {
		
		int c=a*b;
		System.out.println("In class B " + c);
	}
}

public class InheritanceDemo {
	
	public static void main (String[] args)
	{
		
		A a1 = new A();
		
		a1.calculate(4, 5);
		
		
	
	}
	

}
