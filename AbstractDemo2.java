package com.java.demo;

class AbstractSample
{
	public void calc(Number i)    //As Number class is Parent class of Integer,Float,Double, any value can be passed
	{
		System.out.println(i);
	}
}

public class AbstractDemo2 {
	
	public static void main(String[] args)
	{
		AbstractSample obj = new AbstractSample();
		obj.calc(4.678d);
	}

}
