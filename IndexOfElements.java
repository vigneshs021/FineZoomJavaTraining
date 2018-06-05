package com.bsit.javaTraining.Array;

public class IndexOfElements
  {
     
	public static void main(String[] args)
	  {
		int index=0;
		
		int i,number[]={3,4,5,6,7,89};
		
		
		for(i=0;i<number.length;i++)
		{
		  if(number[i]==89)
		   {
		
			  index=i;
		   }
		}
		System.out.println("print the index of elements: "+index);
	  }
  }
