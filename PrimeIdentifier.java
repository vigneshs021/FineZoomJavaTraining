package com.bsit.javaTraining;
import java.util.Scanner;
public class PrimeIdentifier {


    public static void main(String arg[])
	 {
       int number;
       boolean flag = false;
       int i;
      
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number");
       number = in.nextInt();
       
    for(i=2;i<number;i++)
		{
            if(number%i == 0) 
		     {
              flag = true;
             }
        }
           if(flag)  
		    {
               System.out.print(number +"is the not Prime number");
            }
		 else
		   {
               System.out.print(number +"is the  a Prime number");
           }
        }
}