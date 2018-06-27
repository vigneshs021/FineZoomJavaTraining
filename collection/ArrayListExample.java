package com.finezoom.javatraining.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample
{

	public static void main(String[] args)
	{
		List arrayList=new ArrayList();
		
		Scanner ss = new Scanner(System.in);
		int index=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the employee names:");
			arrayList.add(ss.next());
		}
		
		//update
		for(int i=0;i<arrayList.size();i++)
		{
			if( arrayList.get(i).equals("v" ))
			{
				index=i;
				System.out.println(index);
				
			}
		}
		arrayList.set(index, "vik");
		System.out.println(arrayList.toString());
		
		
		//remove
		for(int i=0;i<arrayList.size();i++)
		{
			if( arrayList.get(i).equals("r" ))
			{
				index=i;
				arrayList.remove(index);
				System.out.println(arrayList.toString());
				
		///add		
				arrayList.add(index, "vfggh");
				System.out.println(arrayList.toString());
				
			}
		}
	//find	
		for(int i=0;i<arrayList.size();i++)
		{
			
			if( arrayList.get(i).equals("rdd" ))
			{
				System.out.println("value is present in the array");
			}else
			{
				System.out.println("value is not present in the array");
			}
		}
		
		
	}
	
}
