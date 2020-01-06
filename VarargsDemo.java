package com.java.demo;

class VarDemo
{
	
	int sum = 0;
	
	public int calculate(int ... a) {
		
		int sum=0,n=a.length;
		
		for(int i=0 ; i<n; i++)
		{
			sum+=a[i];
		}
		
		int sum2=0;
		
		for(int k :a)
		{
			sum2+=k;
		}
		
		return sum2;
		
	}
}

public class VarargsDemo {
	
	public static void main (String[] args) {
		
		VarDemo obj = new VarDemo();
		
		int result = obj.calculate(4,3,5,7,8,9,2,3);
		
		System.out.println(result);
	}

}
