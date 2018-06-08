package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * This program is used to calculate maximum values.
 *
 */
public class MaxValue
{

	public static void main(String[] args)
	{
		int[] maximum = new int[4];

		int index;
		int maximumvalue = 0;
		Scanner so = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for (index = 0; index < maximum.length; index++)
		{
			maximum[index] = so.nextInt();
		}

		for (index = 0; index < maximum.length; index++)
		{
			if (maximum[index] > maximumvalue)
			{
				maximumvalue = maximum[index];
			}

		}
		System.out.println("print the values of maximum:" + maximumvalue);
	}

}
