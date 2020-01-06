package com.java.demo;

class SuperParent
{
	
	int i ;
	public SuperParent()
	{
		System.out.println("Parent's constructor");
	}
	
	public void show()
	{
		System.out.println("Parent's show");
		System.out.println("Value of i in Parent "+ i);
	}
}

class SuperChild extends SuperParent
{
	public SuperChild()
	{
		System.out.println("Child's constructor");
	}
	
	public void show()
	{
		
		super.i= 8;
		super.show();
		System.out.println("Child's show");
		System.out.println("Value of i in Child "+ i);
	}
}

class SuperDemo
{
	public static void main(String args[])
	{
		SuperParent obj = new SuperChild();		
		obj.show();
	}
}