package com.finezoom.javatraining.Array;

import java.util.Scanner;

public class ContainSpecificValues
{
public static void main(String[] args)
{
	int[]values={10,20,30,40,50,60};
	 boolean t=false;
	
	  int findvalue=10;

	 for(int start : values)
	 {
		 if(start==findvalue)
		 {
			 System.out.println("print the element is found");
		 }else
		 {
			 System.out.println("print the element is notfound");
		 }
	 }
}
}
