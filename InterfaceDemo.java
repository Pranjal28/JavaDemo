package com.java.example;

interface Writer            //Multiple interfaces can be implemented by a single class, like class A implements B,C
{
	int i=8;
	void show();            //Methods in interfaces are abstract & public by default
    default void defaultmethod()   //Default method can also be overriden
    {
    	System.out.println("In default of interface");
    }
    static void showInfo()
    {
    	System.out.println("In showInfo");
    }
}
                         //Interfaces can't be instantiated, but references can be created 
 
                        //Interfaces help in avoiding the problem of multiple inheritance

class Pencil implements Writer
{
	 public void show()
	{
		System.out.println("In show() of Pencil");
	}
	 
	 public void defaultmethod()   //Default method can also be overriden
	    {
	    	System.out.println("In default of Pencil");
	    }
}

class Pen implements Writer
{
	public void show()
	{
		System.out.println("In show() of Pen");
	}
}

class Kit
{
	public void doSomething(Writer w)
	{
		w.show();
	}
}

public class InterfaceDemo {
	
	public static void main (String[] args) {
		
		Writer p = new Pencil();
		
		Kit k = new Kit();
		k.doSomething(p);
		
		Writer pen = new Pen();
		
		k.doSomething(pen);
		
		p.defaultmethod();
		
		System.out.println(Writer.i);
		Writer.showInfo();
	}

}
