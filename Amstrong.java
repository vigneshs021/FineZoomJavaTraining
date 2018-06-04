package com.bsit.javaTraining;

import java.util.Scanner;

public class Amstrong 
  {
    public static void main(String[] args) 
       {
		
    	 int n,m,total=0,n1;
    	
    	
    	 Scanner am = new Scanner(System.in);
		System.out.println("enter the value of n to check amstrong or not: ");
    	 n=am.nextInt();
    	 n1=n;
    	 
    	 while(n>0)
    	    {
    		m=n%10;
    		 
    		n=n/10;
    		total=total+m*m*m;
    	    }
    	  
    	  if(total==n1)
    	    {
    		  
    		  System.out.println("n is a amstrong");
    	    }
    	  else
    	  {
    		  System.out.println("n is not a amstrong");
    	  }
    	
	   }
  }











