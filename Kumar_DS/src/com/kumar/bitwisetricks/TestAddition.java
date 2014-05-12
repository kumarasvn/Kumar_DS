package com.kumar.bitwisetricks;

import junit.framework.TestCase;


public class TestAddition extends TestCase {
	public void testadd(){
		 int num1 = 3; 
	        int num2 = 2; 
	        int total = 5; 
	        int sum = 0; 
	        sum =Addition.add(num1, num2); 
	        assertEquals("passed",sum, total);
	        fail();
	        System.out.println("it is failed");
	}
	
	public void testsub(){
		 int num1 = 3; 
	        int num2 = 2; 
	        int total = 1; 
	        int sum = 0; 
	        sum =Addition.sub(num1, num2); 
	        assertEquals(sum, total);
	}
	

}
class Addition{
	public static int add(int a,int b){
		return a+b;
		
	}
	public static int sub(int a,int b){
		return a-b;
		
	}
}

