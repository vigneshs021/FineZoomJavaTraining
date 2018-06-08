package com.finezoom.javatraining.Array;

import java.util.ArrayList;
import java.util.Arrays;
/*
 convert the Array into a ArrayList
 
 */
public class ArrayToArraylist
{

	public static void main(String[] args)
	{
		String studentsname[] =
		{ "raja", "ram", "babu", "balu" };
		ArrayList<String> schoolstudents = new ArrayList<String>(Arrays.asList(studentsname));
		int startposition;

		for (startposition = 0; startposition < studentsname.length; startposition++)
		{
			System.out.println(schoolstudents.get(startposition));
		}

	}

}
