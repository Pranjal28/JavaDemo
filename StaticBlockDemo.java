package com.java.demo;

class Employee1
{
	int sid;
	int salary;
	static String ceo;
	
	public Employee1()                        //Constructor will be called each time an object is created
	{
		salary = 3000;
		sid=4;
		System.out.println("In constructor");   //Displayed 2 times
	}
	
	public Employee1(int salary1,int sid1)
	{
		salary = salary1;
		sid = sid1;
	}
	
	static                                      //Static block is used to initialize static variables 
	{                                           //static block will be called only once when class loader loads
		ceo = "Larry";
		System.out.println("In static 1");         //Displayed only one time
	}
	
	static 
	{
		//ceo="Eric";
		System.out.println("In static 2");
	}
	
	
	
	public void details()
	{
		System.out.println(sid + " " + salary + " " + ceo);
	}
}

public class StaticBlockDemo {
	
	static int i =3;    //static variables can be accessed only in static methods
	
	public static void main(String[] args){
		
		Employee1 e1 = new Employee1();  
		
	    
		StaticBlockDemo.i = 8;
         e1.details();
         
         Employee1 e2 = new Employee1(2600,i);  
 		
         e2.details();
         
         
         //Static block will always be executed before the constructor, as class always loads before the object is created
         
		
		
		
	}

}
