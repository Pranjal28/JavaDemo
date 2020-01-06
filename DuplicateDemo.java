package com.java.datastructure;

import java.util.HashMap;
import java.util.Map;

public class DuplicateDemo {
	
	public static void main (String args[])
	{
		String str = "abcade";
		
		char [] charArray = str.toCharArray();
		
		Map <Character, Integer> hm = new HashMap <>();
		
		int c=0;
		
		String strValue = " ";
		
		for(int i=c ; i<charArray.length; i++)
		{
			hm.put(charArray[i], i);
			
			if(hm.get(charArray[i])>1)
			{
				strValue = " ";
				i = i+1;
				
			}
			if(hm.get(charArray[i])==1)
			{
				strValue = strValue + charArray[i];
			}
		}
	}

}
