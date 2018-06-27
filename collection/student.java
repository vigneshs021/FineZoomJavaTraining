
package com.finezoom.javatraining.collection;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import org.omg.CORBA.PUBLIC_MEMBER;

public class student {

	public static void main(String[] args) 
		{
		add();
		}
		public static void add()
		{
		 List<String> aList = new LinkedList<String>();
	
		Scanner ss= new Scanner (System.in);
		
		System.out.println("enter the listsize");
		 int listsize = ss.nextInt();
		 
		 System.out.println("enter the names in list:");
		 
		 for(int i=0;i<listsize;i++)
		 {
			 aList.add(ss.next());
			
		 }
		System.out.println(aList);
		
		
		
	//update	
		
		int index=0;
		for(int i=0;i<aList.size();i++)
		{
			if(aList.get(i).equals("a" ))
			{
				 index = i;
				System.out.println(index);
				
			}
		}
		
		
		//int index = 0;
		aList.set(index, "vik");
		System.out.println(aList.toString());
		
		
		
		
		//remove
		for(int i=0;i<aList.size();i++)
		{
			if( aList.get(i).equals("l" ))
			{
				
				aList.remove(index);
				System.out.println(aList.toString());
							
			}
		}
		
		
		//find	
				for(int i=0;i<aList.size();i++)
				{
					
					if( aList.get(i).equals("r" ))
					{
						System.out.println("value is present in the array");
					}else
					{
						System.out.println("value is not present in the array");
					}
				}
		
}
		
}

		

