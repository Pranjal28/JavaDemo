package com.java.modifiers;

import java.util.HashMap;
import java.util.Map;

public class Solution {

   public static void main(String args[])
   {
	   int a[][] = {{1,2,3},{2,5},{3,4}};
	   
	   HashMap <Integer,Integer> map = new HashMap<Integer,Integer>(a.length);   
	   
	   for(int[] mapping : a)
	   {
		   map.put(mapping[0],mapping[1]);
	   }
	   
	   for(Map.Entry<Integer, Integer> hm : map.entrySet())
	   {
		   System.out.println(hm.getKey() + " " + hm.getValue());
	   }
	   

   }
}
