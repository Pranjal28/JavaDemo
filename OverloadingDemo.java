package com.java.demo;

class Operation
{
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	public void product(int a, int b)
	{
		System.out.println(a*b);
	}
	public void divide(int a, int b)
	{
		System.out.println(a/b);
	}
	
     
}




public class OverloadingDemo {
	
	public static void main (String[] args) {
		
		Operation obj = new Operation();
		
		obj.add(3, 2);
		obj.subtract(6,3);
		obj.product(7, 11);
		obj.divide(35, 5);
		
		
	}

}
