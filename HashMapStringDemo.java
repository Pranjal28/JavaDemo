package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapStringDemo {
	
	public static void main (String args[])
	{
		Map<String,Integer> hm = new HashMap<>();
		
		String s = "Today this a beautiful day";
		
		String str[] = s.split(" ");
		int l = str.length;
		
		for(String s1 : str)
		{
			hm.put(s1, s1.length()%2==0?s1.length():0);
		}
		
		int maxLength=0;
		String strValue = null;
		
		for(Map.Entry<String, Integer> hashMap : hm.entrySet())
		{
			if(hashMap.getValue() > maxLength)
			{
				maxLength = hashMap.getValue();
				strValue = hashMap.getKey();
			}
		}
		
		System.out.println("Longest string is " + strValue + " with length value "+maxLength);
	}

}
