package com.finezoom.javatraining.collection;
import java.util.HashSet;
import java.util.Scanner;

import com.finezoom.javatraining.students.Student;

public class HashSets {

	public static void forEach(HashSet<Student> studentDetails) 
	{
		for (Student s : studentDetails)
		{
			System.out.println(s.getRollno() + s.getName() + s.getAge() + s.getMarkaverage());
		}
	}
	
	public static HashSet<Student> addStudentDetails(int size) {
		int count = 1;
		
		Scanner scan = new Scanner(System.in);
	
		HashSet<Student> List = new HashSet<Student>();
		for (int i = 0; i < size; i++) {
			Student	s = new Student();

			System.out.println("Enter the " + count + " student Details");
			System.out.println("Enter the student rollno");
			s.setRollno(scan.nextInt());
			System.out.println("Enter the student name");
			s.setName(scan.next());
			System.out.println("Enter the student age");
			s.setAge(scan.nextInt());
			System.out.println("Enter the student mark");
			s.setMarkaverage(scan.nextInt());
			List.add(s);
			count++;
		}
		return List;

	}
//update
	
	public static HashSet<Student> updateStduentDetails(int Rollno,HashSet<Student> stdlists) {
	
		Scanner sc = new Scanner(System.in);
		
		for(Student astudent:stdlists)
		{
			if(Rollno == astudent.getRollno())
			{
				System.out.println("Enter the rollno for update");
				astudent.setRollno(sc.nextInt());
				System.out.println("Enter the student name for update");
				astudent.setName(sc.next());
				System.out.println("Enter the student age for update");
				astudent.setAge(sc.nextInt());
				System.out.println("Enter the student mark for update");
				astudent.setMarkaverage(sc.nextInt());
			}
		}
		return stdlists;
	}
	
	//remove
	
	public static HashSet<Student> remove(int id,HashSet<Student> removeList) {
	

		
		HashSet<Student> removeLists = removeList;
		
		for (Student ss : removeLists)
		{

			Student semp=new Student();
			
			if (id == ss.getRollno()) 
			{
				
			
				semp.setRollno(ss.getRollno());
				semp.setName(ss.getName());
				semp.setAge(ss.getAge());
				semp.setMarkaverage(ss.getMarkaverage());
			}
			removeLists.remove(semp);
			
		}
	
		return removeLists;
		

	}
}
