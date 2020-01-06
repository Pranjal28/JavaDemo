package com.java.interview;

public class ProductDemo {
	
	public static int[] calculateProduct(int arr[])
	{
		int p[] = new int[2];
		
		int l = arr.length,prod,maxValue=0;
		
		for(int i=0;i<l-1;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				prod = arr[i] * arr[j];
				
				if(prod>maxValue)
				{
					maxValue=prod;
					
					p[0] = arr[i];
					p[1] = arr[j];
				}
			}
		}	
		
		return p;
	}
	
	public static void main(String[] args) {

		int a[] = {2,4,0,7,-8};
		
		int b[] = new int[2];

		b = calculateProduct(a);

		for(int i=0; i <b.length; i++)
		System.out.println(b[i]);

	}

}
