package com.java.sort;

public class BinarySearch {
	
	public int binarySearch(int a[], int l, int r, int x)
	{
		int mid = l + (r-1)/2;
		
		if(x==a[mid])
			return mid;
		if(x>a[mid])
			return binarySearch(a,mid+1,r,x);
		
		return binarySearch(a,l,mid-1,x);
		
	
}
	
	
	public static void main(String args[])
	{
		BinarySearch obj = new BinarySearch();
		
		int a [] = {23,11,15,1,4,2};
		
		int x=15;
		
		int b = obj.binarySearch(a,0,a.length-1,x);
		
		System.out.println(b);
	}

}
