package com.java.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String args[]) {
		
		List <Integer> valuesList = new ArrayList<>();
		
		Map <Integer,Integer> hashMap = new HashMap<>();
		
		valuesList.add(2);
		valuesList.add(4);
		valuesList.add(3);
		valuesList.add(8);
		valuesList.add(3);
		valuesList.add(2);
		
		for(Integer i : valuesList)
		{
			hashMap.put(i, hashMap.get(i)==null?1 : hashMap.get(i)+1);
		}
		
		hashMap.remove(2);
		
		for(Map.Entry<Integer, Integer> mapValues : hashMap.entrySet())
		{
			System.out.println(mapValues.getKey() + " " + mapValues.getValue());
					
		}
		System.out.println();
	}
}
