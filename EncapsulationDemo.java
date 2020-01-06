package com.java.demo;

// Encapsulation -> Binding of data to methods

class Encapsulation
{
	int rollno;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationDemo {
	
	public static void main (String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setRollno(123);
		obj.setName("Pranjal");
		
		System.out.println("Rollno "+obj.getRollno());
		System.out.println("Name "+obj.getName());
		
		
	}

}
