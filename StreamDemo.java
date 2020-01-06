package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String args[])
	{
		List<Integer> value = new ArrayList<>();
		value.add(3);
		value.add(2);
		value.add(13);
		value.add(7);
		
		List<Integer> sortedValues = value.stream().sorted().collect(Collectors.toList());
		
		List<Integer> otherValues = value.stream().sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		
		List<Integer> exampleValues = value.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		for(Object o : exampleValues)
		{
			System.out.println(o);
		}
		
		List<Integer> newValues = value.stream().map(i -> i +2).collect(Collectors.toList());
		
		int countValue = (int)newValues.stream().count();
		
		//System.out.println(countValue);
		
		for(Object o : newValues)
		{
			//System.out.println(o);
		}
	}

}
