package com.java.thread;

class A extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
}
public class ThreadDemo {
	
	public static void main (String[] args)
	{
		A a = new A();
		B b = new B();
		
		a.start();
		
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			
		}
		b.start();
	}

}
