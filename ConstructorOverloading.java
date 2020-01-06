package com.java.demo;

class CasioCalc
{
	int num1;
	int num2;
	String op;
	
	public CasioCalc()
	{
		num1=3;
		num2=5;
		op="Add";
	}
	
	public CasioCalc(int a, int b)
	{
		num1=a;
		num2=b;
		op="Add";
	}
	
	public CasioCalc(int a, int b, String c)
	{
		num1=a;
		num2=b;
		op=c;
	}
}

public class ConstructorOverloading {
	
	public static void main (String args[]) {
		
		CasioCalc obj = new CasioCalc(4,5,"Add");
		
		System.out.println(obj.num1 + " " + obj.num2 + " " + obj.op);
	}

}
