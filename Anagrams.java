package com.java.interview;

public class Anagrams {
	
	public static void permute(String str, int l, int r)
	{
		
		if(l==r)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=l; i<=r ; i++)
			{
				str = swap (str,l,i);
				permute(str,l+1,r);
				str = swap (str,l,i);
			}
		}
		
	}
	
	public static String swap(String s, int i, int j)
	{
		char charArray[] = s.toCharArray();
		
		char temp;
		
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		String str = String.valueOf(charArray);
		
		return str;
	}
	
	public static void main (String args[])
	{
		String s = "abc";
		
		int l = s.length();
		permute(s,0,l-1);
	}

}
