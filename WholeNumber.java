package com.bsit.javaTraining;

import java.util.Scanner;

public class WholeNumber 
 {
    public static void main(String[] args)
     {
	
	  int a,b,c;
	  
	  Scanner wh = new Scanner(System.in);
	  
	  System.out.println("Enter the value of a:");
	  a=wh.nextInt();
	  
	  System.out.println("Enter the value of b:");
	  b=wh.nextInt();
	  
	   c=a/b;
	   System.out.println("print the value of divider: "+c);  
	  	  
	   c=a%b;
	   System.out.println("print the value of remainder: "+c); 
	   
      }
 } 