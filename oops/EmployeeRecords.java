package com.finezoom.javatraining.oops;

import java.util.Scanner;

public class EmployeeRecords {
	static String option;
	 
	public static void main(String[] args) {

		EmployeeDetailsImpl st = new EmployeeDetailsImpl();
		
		do{
		
		System.out.println("1 is create userdetails");
		System.out.println("2 is update userdetails");
		System.out.println("3 is delete userdetails");
		System.out.println("enter the number");
		
		String option = "";
		Scanner sc = new Scanner(System.in);
		int numberDetails = sc.nextInt();
	
		
		switch (Integer.valueOf(numberDetails)) {
		
		case 1: {

			System.out.println("create the new user");
			System.out.println("enter the new employee details");
			System.out.println("enter the new employee id,name,age,address,salary");
			System.out.println("enter your id");
			int id = sc.nextInt();
			System.out.println("enter your name");
			String name = sc.nextLine();
			System.out.println("enter your age");
			String age = sc.nextLine();
			System.out.println("enter your address");
			String address = sc.nextLine();
			System.out.println("enter your salary");
			int salary = sc.nextInt();			
			st.create(id, name, age, address, salary);
			System.out.println("complete the create of user");
			System.out.println("enter yes to exit");
			System.out.println("enter no to continue in userdetails");
			break;
		}	
		case 2: {
			System.out.println("enter the details to update employeee ");
			System.out.println("enter the update employee id,name,age,address,salary");
			System.out.println("enter your id");
			int id = sc.nextInt();
			System.out.println("enter your name");
			String name = sc.nextLine();
			System.out.println("enter your age");
			String age = sc.nextLine();
			System.out.println("enter your address");
			String address = sc.nextLine();
			System.out.println("enter your salary");
			int salary = sc.nextInt();
			
			System.out.println("complete the update of user");
			System.out.println("enter yes to exit");
			System.out.println("enter no to continue in userdetails");
			st.update(id, name, age, address, salary);
			
			System.out.println("enter your option");
			break;
		}

		case 3: {
			System.out.println("delete the user details");
			System.out.println("enter the  user name to delete");
			System.out.println("enter your name");
			String name = sc.nextLine();

			st.delete(name);
			System.out.println("complete the deleted");
			System.out.println("enter yes to exit");
			System.out.println("enter no to continue in userdetails");
			break;
            }
		
		}
		System.out.println("enter your option");
		option = sc.nextLine();
		}
		while(option =="yes");
		{
			System.out.println("Exist the program");
		}
	
}


}
