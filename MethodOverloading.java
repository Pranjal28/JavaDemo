package com.java.demo;

class Casio
{
	public void add(int num1, int num2)
	{
		System.out.println(num1+ num2);
	}
	public void add(int num1, int num2,int num3)
	{
		System.out.println(num1+ num2+num3);
	}
	public void add(double num1, double num2)
	{
		System.out.println(num1+ num2);
	}
}

public class MethodOverloading {
	
	public static void main(String []args) {
		
		Casio obj = new Casio();
		
		obj.add(4,3);
		obj.add(4,3,5);
		obj.add(2.1,3.4);
	}

}
