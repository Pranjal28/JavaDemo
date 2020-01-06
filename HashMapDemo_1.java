package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	
	public static void main (String args[])
	{
		Map<String,Integer> hashMap = new HashMap<>();
		
		String str = "I am am coding in in in Java Java";
		
		String [] s = str.split(" ");
		
		for(String s1 : s)
		{
			hashMap.put(s1, hashMap.get(s1)==null?1: hashMap.get(s1)+1);
		}
		
		int maxValue=0;
		String maxKey = null;
		
		for (Map.Entry<String, Integer> hm : hashMap.entrySet())
		{
			if(hm.getValue()>maxValue)
			{
				maxValue = hm.getValue();
				maxKey = hm.getKey();
			}
		}
		
		System.out.println(" Max word which occurs " + maxValue + " times, is "+maxKey);
	
	}

}
