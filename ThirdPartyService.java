//package com.demo.services;
//
//import java.util.Date;
//
//@RestController
//class ThirdPartyService extends Thread
//{
//	
//	public long timeCalc=0;
//	public void run()
//	{
//		
//		 getTimeValue1(0);
//		 getTimeValue2(0);
//		 getTimeValue3(0);
//		
//	}
//	@RequestMapping("/function-1")
//	public void getTimeValue1(@GetParam("StartTime") long startTime)
//	{
//	     long countTime=0;
//		
//		Thread.sleep(1000);
//		
//		countTime+= 1000;
//		
//		timeCalc+=  new Date().getTime() - startTime -countTime;
//		
//		
//	}
//	
//	@RequestMapping("/function-2")
//	public void getTimeValue2(@GetParam("StartTime") long startTime)
//	{
//		long countTime=0;
//		
//		Thread.sleep(1000);
//		
//		countTime+= 1000;
//		
//		timeCalc+=  new Date().getTime() - startTime -countTime;
//		
//	}
//	
//	@RequestMapping("/function-3")
//	public void getTimeValue3(@GetParam("startTime") long startTime)
//	{
//long countTime=0;
//		
//		Thread.sleep(1000);
//		
//		countTime+= 1000;
//		
//		timeCalc+=  new Date().getTime() - startTime -countTime;
//		
//		
//	}	
//	
//}
//
//class ThirdPartyDemo {
//	
//	public static void main (String args[])
//	{
//		ThirdPartyService obj = new ThirdPartyService();
//		
//		Thread t1 = new Thread(obj);
//		
//		t1.start();
//		
//		System.out.println("Total time taken " + obj.timeCalc/1000);
//		
//		
//	}
//
//
//}
