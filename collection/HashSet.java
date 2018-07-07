package com.finezoom.javatraining.collection;

import java.util.Scanner;

public class HashSet {
 public static void main(String[] args) {
	
	 
	 Scanner sd= new Scanner(System.in);
	 
	 System.out.println("enter the size of list");
	 int lists=sd.nextInt();
	 
	//add	 
	 HashSet<student> studentlist =HashSets.addStudentDetails(lists);
	 HashSets.forEach(studentlist);

	 
//update
	 
	 System.out.println("Enter the update name");
		String name = sd.next();
	 
		HashSet<student> updatelist =HashSets.updateStduentDetails(name,studentlist);
	 HashSets.forEach(updatelist);
	 
	 
	//remove 
	 
	 
	 System.out.println("Enter the remove id");
		int id = sd.nextInt();
	 
		HashSet<student> removelist =HashSets.updateStduentDetails(id,studentlist);
	 HashSets.forEach(removelist);
	 
 }
	 
}
