package com.bsit.javaTraining;

import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args)
	{
		int salary = 0;
		String name;
		int t;

		int sum;
		float average;
		
		
		int percentage = 0;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the employee name:");
		name = sc.next();

		System.out.println("enter the first month salary of employee:");
		int salary1 = sc.nextInt();

		System.out.println("enter the second month salary of employee:");
		int salary2 = sc.nextInt();

		System.out.println("enter the third month salary of employee:");
		int salary3 = sc.nextInt();

		System.out.println("enter the fourth month salary of employee:");
		int salary4 = sc.nextInt();

// sum of salary
		System.out.println("enter the total salary of employee");
		sum = (salary1 + salary2 + salary3 + salary4);
		System.out.println(sum);

		// average of salary
		System.out.println("the average value of employee salary");
		average = sum / 4;
		System.out.println(average);

// max salary
		if ((salary1 > salary2) && (salary1 > salary3) && (salary1 > salary4)) 
		   {
			System.out.println("print the max salary" + salary1);
		   } 
		   else if ((salary2 > salary3) && (salary2 > salary4)) 
		      {
			  System.out.println("print the max salary" + salary2);
		      }

		   else if (salary3 > salary4)  
		     {
			  System.out.println("print the max salary" + salary3);
		     }

		else
		    {
			System.out.println("print the max salary" + salary4);
		    }

// min salary

		if ((salary1 < salary2) && (salary1 < salary3) && (salary1 < salary4))  
		     {
			 System.out.println("print the mim salary" + salary1);
		     }
		  else if ((salary2 < salary3) && (salary2 < salary4))
		    {
			System.out.println("print the max salary" + salary2);
		    }

		  else if (salary3 < salary4) 
		    {
			System.out.println("print the mim salary" + salary3);
		    }

		else
		   {
			System.out.println("print the mim salary" + salary4);
		   }
		
		
		
//increment by percentage
		
			/*	System.out.println("enther the salary1 "+salary1);
				System.out.println("enter the percentage");
				percentage =  sc.nextInt();
				salary2 = (salary1*percentage/100) + salary1;
				System.out.println("print the amount of salary2 "+salary2);
				
				
				System.out.println("enther the salary2 "+salary2);
				System.out.println("enter the percentage");
				percentage =  sc.nextInt();
				salary3 = (salary2*percentage/100) + salary2;
				System.out.println("print the amount of salary3 "+salary3);
				
				
				System.out.println("enter the salary3 "+salary3);
				System.out.println("enter the percentage");
				percentage =  sc.nextInt();
				salary4 = (salary3*percentage/100) + salary3;
				System.out.println("print the amount of salary4 "+salary4); */
				
				

//	ascending order
		
		for (int count = 0; count < 4; count++) {

			if (salary2 < salary1) {
				t = salary1;
				salary1 = salary2;
				salary2 = t;
			}

			if (salary3 < salary2) {
				t = salary2;
				salary2 = salary3;
				salary3 = t;
			}

			if (salary4 < salary3) {
				t = salary3;
				salary3 = salary4;
				salary4 = t;
			}

		}
         
		System.out.println("print the salary in ascending order");
		System.out.println(salary1+" "+salary2+" "+salary3+" "+salary4);
		
 // descending order		
		
		for (int count = 0; count < 4; count++) {

			if (salary2 > salary1) {
				t = salary1;
				salary1 = salary2;
				salary2 = t;
			}

			if (salary3 > salary2) {
				t = salary2;
				salary2 = salary3;
				salary3 = t;
			}

			if (salary4 > salary3) {
				t = salary3;
				salary3 = salary4;
				salary4 = t;
			}

		}
       
		System.out.println("print the salary in descending order");
		System.out.println(salary1+" "+salary2+" "+salary3+" "+salary4);
		
		
 
		/*//incentive
		int totalamount;
		int incentive;
		
		sy
		
		incentive=(salary1/100)*percentage;
		
		
		totalamount=salary+incentive; */
		
	}

}
