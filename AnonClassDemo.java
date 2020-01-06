
package com.java.example;

interface Abc
{
	public void show();
}

//class OuterClassExample
//{
//	public void show()
//	{
//		System.out.println("In A show");
//	}
//}

public class AnonClassDemo {
	
	public static void main (String args[])
	{
		Abc obj = new Abc()   //Anonymous class to instanitate interface
				{
			public void show()
			{
				System.out.println("In Anonymous class");
			}
				};
		
		obj.show();
	}

}
