package com.finezoom.javatraining.oops;

public class EmployeeDetailsImpl implements EmployeeDetails {

	EmployeeModel model = new EmployeeModel();
	@Override
	public String create(int Id, String Name, String Age,String Address,int Salary) 
	{
		
		
		int EmployeeId = 0;
		model.setId(EmployeeId);
		String EmployeeName = null;
		model.setName(EmployeeName);
		String EmployeeAge = null;
		model.setAge(EmployeeAge);
		String EmployeeAddress = null;
		model.setAddress(EmployeeAddress);
		int EmployeeSalary = 0;
		model.setSalary(EmployeeSalary);
		
		EmployeeDatabase obj = new EmployeeDatabase();
		obj.dbConnection(model);
		
		return null;
	}

	@Override
	public String update(int Id, String Name, String Age, String Address,int Salary) {
		model.setId(Id);
		model.setName(Name);
		model.setAge(Age);
		model.setAddress(Address);
		model.setSalary(Salary);
		
		EmployeeDatabase uc = new EmployeeDatabase();
		uc.updateconnection(model);
		return null;
	}

	@Override
	public String delete(String Name)
	{
		model.setName(Name);
		
		EmployeeDatabase dc = new EmployeeDatabase();
		dc.updateconnection(model);
		return null;
	}



}
