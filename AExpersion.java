package com.bsit.javaTraining;

import java.util.Scanner;

public class AExpersion  
  {
   public static void main(String[] args)
    {
	double m=0,n=0,cal,calculation;
	
	
	Scanner AE = new Scanner(System.in);
	
	 System.out.println("Enter the value of m:");
	  m=AE.nextInt();
	  
	  System.out.println("Enter the value of n:");
	  n=AE.nextInt();
	
 //(a+b)^2	  
	  calculation = ((m*m)+(2*m*n)+(n*n));
	  
	  System.out.println("print the values of calculation: "+calculation);
	  
//m^5+2mn+n^12	  
	  calculation = ((m*m*m*m*m)+(2*m*n)+(n*n*n*n*n*n*n*n*n*n*n*n));
	  
	  System.out.println("print the values of calculation: "+calculation);
	  

		double m1 = Math.pow(m,5);
		double n1 = Math.pow(n,12);
		double o = 2*m1*n1;
	  cal = m1+n1+o;
	  System.out.println("print the values of calculation: "+cal);
    }
  }
