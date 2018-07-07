package com.finezoom.javatraining.oops;

public interface EmployeeDetails {

	 public String create(int id,String name,String age,String Address,int salary);
	 public String update(int id,String name,String age,String Address,int salary);
	 public String delete(String name);
}
