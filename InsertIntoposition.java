package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * program to insert the integer values into the position.
 */
public class InsertIntoposition
{

	public static void main(String[] args)
	{

		int Value[] = new int[4];
		int insertposition;
		int index = 0, j = 0;

		int newValue[] = new int[4];

		Scanner vv = new Scanner(System.in);
		System.out.println("Enter the input value");
		for (index = 0; index < Value.length; index++)
		{
			Value[index] = vv.nextInt();
		}

		System.out.println("Enter the insert value");
		newValue[j] = vv.nextInt();

		System.out.println("enter the  position");
		insertposition = vv.nextInt();

		for (index = 0; index < Value.length; index++)
		{
			if (index == insertposition)
			{
				Value[index] = newValue[j];
			}
			System.out.println(Value[index]);
		}
	}

}
