package com.java.demo;

class Employee
{
	int sid;
	int salary;
	static String ceo;
	
	
	public void details()
	{
		System.out.println(sid + " " + salary + " " + ceo);
	}
}

public class StaticDemo {
	
	public static void main(String[] args){
		
		Employee e1 = new Employee();   //Employee e loads the class, class loader is launched, then
		                               //new Employee() loads heap memory.
	    e1.sid=4;
	    e1.salary = 5000;
	    e1.ceo="Rob";
	    
	    //e1.details();             -> If details is invoked from here, e1.ceo=Rob
	     
	    Employee e2 = new Employee();
	    
	    e2.sid=10;
	    e2.salary = 7600;
	    e2.ceo="John";
	    
	    Employee.ceo="Rahul";   //We can use the class-name for a static variable to be invoked
	    
	    
		e1.details();
	    e2.details();            //static variable is same for all objects, all objects share same value
		                         // If e1 details are invoked from here, e1.ceo = e2.ceo = Rahul
		
		
		
		
	}

}
