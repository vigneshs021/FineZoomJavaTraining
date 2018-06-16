package com.finezoom.javatraining.ioexception;

import java.io.FileNotFoundException;

public class Divide
{
public static void main(String[] args)
{
   try
     {
	  Divide a = new Divide();
	  a.display();
        }
   catch (Exception e)
       {
	   System.out.println(e);
       }	 
   finally
       {
    	 System.out.println("process over");
          }
 }
     public void display()throws ArithmeticException
          {
        	int a,c;
        	char b;
            	a=10;
               	char w=0;
				b=w;
	          c=a/b;
	          
	          System.out.println(c);
	      	if(c==5)
	      	{
	      		System.out.println(c);
	      	}
	
     }
}
