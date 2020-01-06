package com.java.demo;

public class AdvancedFor {
	
	public static void main (String[] args) {
		
		int a[] = {3,4,5,6};
		int b[] = {1,2,3};
		int c[][] = { {3,4,5,6},
				{1,2,3}};
		
		int sum1=0;
		
		for(int i =0 ; i<c.length;i++)
		{
			for(int j=0; j<c[i].length;j++)
			{
				sum1+=c[i][j];
			}
		}
		
		System.out.println(sum1);
	
		int sum2=0;
		
		for (int k[] : c)
		{
			for (int j : k) 
			{
				sum2 += j;
			}
		}

		System.out.println(sum2);
	}

}
