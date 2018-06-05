package com.bsit.javaTraining.Array;

import java.util.Scanner;

public class CalculateAverage
 {
    
	public static void main(String[] args)
	  {
		//int[] tan=new int [4];
		int[] tan={10,20,30,40,50,60};
		int i,number,sum=0;
		


		for(i=0;i<tan.length;i++)
		{
		 sum =sum+tan[i];
		}
		 System.out.println("print the sum of values: "+sum);
		 
		 int average=sum/tan.length;
		 
		 System.out.println("print the average values: "+average);
   	  }
 } 
