package com.bsit.javaTraining.Array;

import java.util.Scanner;

public class SumTheValues
 {

	public static void main(String args[])
	  {
		
		//int[]amount=new int[2];
	    int[] amount={5,8,5};
		 //amount[0]=;
		
	
		int sum=0;
		
				for(int startingnumber:amount)
		{
			 sum =sum + startingnumber;
			
			System.out.println("Print the sum of values: "+sum);
			
			int average=sum/amount.length;
			
			
			System.out.println("Print the average of values: "+average);
		}
	  }
 }






















































 