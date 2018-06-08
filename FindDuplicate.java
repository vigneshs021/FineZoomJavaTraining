package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * Find duplicate or repeating string value from the numbers.
 *
 */
public class FindDuplicate
{
	public static void main(String[] args)
	{

		// String[] arr= new String[5];
		String[] studentnames =
		{ "raja", "ram", "naveen", "bharat", "ram", "bharat" };

		int aray;
		
		boolean duplicateElementsFound = false;

		

for (int index = 0; index < studentnames.length; index++)
		{
			for (int childindex = index + 1; childindex < studentnames.length; childindex++)
			{
				if (studentnames[index].equals(studentnames[childindex]))
				{
					duplicateElementsFound = true;
					System.out.print(studentnames[index] + " ");
				}
			}
		}
		if (!duplicateElementsFound)
		{
			System.out.println("no duplicateElementsFounds");
		}

	}
}
