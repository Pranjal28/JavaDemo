package com.java.example;


class A            //Final class can't be inherited, final method can't be overriden, final variables can be changed once initialized
{
	 int i=40;
	public void show() {
	 
	}	

}

final class B extends A
{
	int i =20;
	
	public void show() {
		
}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		final B b = new B();
		b.show();
		b.i = 30;
		System.out.println(b.i);
		
	}
		
	
}
