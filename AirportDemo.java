package com.demo.airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AirportDemo {
	
	public static void main (String Args[])
	{
	
		String strValue = "BLR";
		
        ArrayList <String> values = getUnreachableAirports(strValue);
        
        if(values.size()==0)
        {
        	System.out.println("Exception : No such airport exists. ");
        }
        if (values.size() == 1)
        {
        	System.out.println(" " +values.toString() + "");
        }
        if (values.size() > 1)
        {
        	//System.out.print("[");
        	for(String strAirports : values)
        	{
        		System.out.print(strAirports.toString() + ",");
        	}
        	//System.out.print("]");
        }
		
	}
	
	
	public static Map <Integer, String> calculateAirports(Map <Integer, String> depAirport, Map <Integer, String> arrAirport, 
			Map <Integer, Double> depTime, Map <Integer, Double> arrTime, String strValue, double calcTime)
	{
		
		Map <Integer, String> reachedAirport = new HashMap<>();
		
		for(Map.Entry<Integer, String> depA : depAirport.entrySet())
		{
			if(strValue.equals(depA.getValue()))
			{	

				for(Map.Entry<Integer, Double> depT : depTime.entrySet())
				{
					if(depA.getKey().compareTo(depT.getKey())==0)
					{
						for(Map.Entry<Integer, String> arrA : arrAirport.entrySet())
						{
							if(depT.getKey().compareTo(arrA.getKey())==0)
							{
								
								for(Map.Entry<Integer, Double> arrT : arrTime.entrySet())
								{
									if(arrA.getKey().compareTo(arrT.getKey())==0)
									{
										if(arrT.getValue() -  depT.getValue() > 0)
										{
											reachedAirport.put(arrA.getKey(), arrA.getValue());
										}
									}
								}
							}
						}
					}
				}
			}
		}
						
				
		
		return reachedAirport;
	}
	
	public static ArrayList<String> getUnreachableAirports(String city)
	{
        Map <Integer, String> arrAirport = new HashMap<>();  // Flt No & Arr Airport
		
		Map <Integer, String> depAirport = new HashMap<>();  //Flt No & Dep Airport
		
		Map <Integer, Double> arrTime = new HashMap<>(); // Flt No & Arr Time
		
		Map <Integer, Double> depTime = new HashMap<>(); // Flt No & Dep Time
		
		depAirport.put(123, "BLR");
		depAirport.put(678, "BOM");
        // Other values
		
		arrAirport.put(123, "BOM");
		arrAirport.put(678, "MAA");
		// Other values
		
		depTime.put(123, Double.parseDouble("0600"));
		depTime.put(678, Double.parseDouble("0800"));
		//Other values
		
		arrTime.put(123, Double.parseDouble("0900"));
		arrTime.put(234, Double.parseDouble("1000"));
		//Other values
				  	
		ArrayList <String> airports = new ArrayList <>();
		
		double calcTime = 0;
		
		Map <Integer, String> reachedAirports = calculateAirports(depAirport , arrAirport, depTime , arrTime, city, calcTime);
		
		
		for(Map.Entry<Integer, String> airportValue : reachedAirports.entrySet())
		{
			
			for(Map.Entry<Integer, String> arrAirportValue : arrAirport.entrySet())
			{
				if(!(airportValue.getValue().equals(arrAirportValue.getValue())))
				{
					airports.add(airportValue.getValue());
					break;
				}
			}
		}
					
			
		return airports;
	}

}
