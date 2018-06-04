package com.bsit.javaTraining;

import java.util.Scanner;

public class CompareNumericValues
  {

	public static void main(String[] args) 
	  {
		
		int a,b,c;
		
		Scanner cn =new Scanner(System.in);
		System.out.println("enter the value of a: ");
		  a=cn.nextInt();
		
		System.out.println("enter the value of b: ");
		  b=cn.nextInt();
		
		System.out.println("enter the value of c: ");
		  c=cn.nextInt();
		 
  //greater than  
		 if(a>b)
		   {
			 System.out.println("a is greater");
		   }
		 else
		   {
			 System.out.println("b is greater");
		   }
		 
 //	less than 
		 if(c<b)
		    {
			 System.out.println("c is lesser");
		    }
		 else
		     {
			  System.out.println("b is lesser");
		     }
		 
 // equal	
		 if(a==c)
		     {
			 System.out.println("a is equal to c");
		     }
		 else
	    	 {
			 System.out.println("a is not equal to c");
		     }
	  }
	
}
