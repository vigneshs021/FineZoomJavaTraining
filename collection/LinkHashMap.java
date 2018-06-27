package com.finezoom.javatraining.collection;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.jar.Attributes.Name;





public class LinkHashMap {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//add();
		//find();
		update();
	}
	
	

	//Add 
	
	public static void add() {
		Map<Integer,name> aLink = new LinkedHashMap<Integer, name>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		
		System.out.println("Enter the input element");
		for (int i = 0; i < size; i++) {
			name na = new name();
			na.setaName(scan.next());
			aLink.put(i, na);
		}
		System.out.println("LinkedHashMap");
		
	
		for (Map.Entry<Integer, name> aTest : aLink.entrySet()) {
			System.out.println(aTest.getValue().getaName());
		}
	}
	
	//find 
	
	
	private static void find() {
		Map<Integer, name> aLink = new LinkedHashMap<Integer, name>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();	
		
		System.out.println("Enter the input element");
		for (int i = 0; i < size; i++) 
		{
			name aname = new name();
			aname.setaName(scan.next());
			aLink.put(i, aname);
		}
		System.out.println("LinkedHashMap");
		for (Entry Test : aLink.entrySet()) 
		{
			System.out.println(((name) Test.getValue()).getaName());
		}
		
		
		
		System.out.println(" The value are");
		int key = scan.nextInt();
		name find = aLink.get(key);
		System.out.println(find.getaName());
	}
	
	//update
	private static void update() 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = scan.nextInt();
		
		Map<Integer, name> aLink = new LinkedHashMap<Integer, name>();
		
		System.out.println("Enter the input element");

		for (int i = 0; i < size; i++)
		{
			name names = new name();
			names.setaName(scan.next());
			aLink.put(i, names);
		}
		for (Entry<Integer, name> test : aLink.entrySet()) 
				
		{
			System.out.println(test.getKey() + " " + test.getValue().getaName());
		}
		System.out.println("update the value ");
		name name = new name();
		
		System.out.println("Enter the key");
		int newkey = scan.nextInt();
		
		System.out.println("Enter the key element");
		name.setaName(scan.next());
		
		name find = aLink.put(newkey, name);
		
		for (Entry<Integer, name> test : aLink.entrySet()) {
			System.out.println(test.getKey() + " " + test.getValue().getaName());
		}
		
		
		
	}
}



