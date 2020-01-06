package com.java.interview;

public class BlockHeight {
	
	public static int calculateBlock(int n) {
		
		int sum=0,count=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			if(sum>n)
				break;
			else
				count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {

		int N = 16;

		int x = calculateBlock(N);

		System.out.println(x);

	}
	
	

}
