package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * Find the second largest value in the given values.
 */
public class SecondLargest
{
	public static void main(String[] args)
	{

		int[] numbervalues = new int[5];
		int index, dummy;

		Scanner d = new Scanner(System.in);

		System.out.println("enter the all values");
		for (index = 0; index < numbervalues.length; index++)
		{
			numbervalues[index] = d.nextInt();
		}

		for (int rootindex = 0; rootindex < numbervalues.length; rootindex++)
		{
			for (int childindex = 0; childindex < numbervalues.length; childindex++)
			{
				if (numbervalues[rootindex] < numbervalues[childindex])
				{
					dummy = numbervalues[rootindex];
					numbervalues[rootindex] = numbervalues[childindex];
					numbervalues[childindex] = dummy;
				}

			}
		}
		System.out.println("print the second largest values is " + numbervalues[numbervalues.length - 2]);
	}
}
