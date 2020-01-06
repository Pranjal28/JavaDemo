package com.java.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
	
	
	public static void compute(List <Integer> example)
	{
		HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(Integer i : example)
		{
			Integer j = map.get(i);
			map.put(i, (j==null)? 1 : j+1);
		}
		
		for(Map.Entry<Integer, Integer> hm : map.entrySet())
		{
			//System.out.println("Key is " + hm.getKey() + " Value is " + hm.getValue());
			if(hm.getValue() == 1)
			{
				System.out.println("Unique value is " + hm.getKey() );
			}
		}
		
		
	}
	
	public static void main (String args[])
	{
		List <Integer> values = new ArrayList<>();
		
		values.add(2);
		values.add(3);
		values.add(1);
		values.add(2);
		values.add(3);
		
		
		compute(values);
	}

}
