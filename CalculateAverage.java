package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 This program is used to calculate the average of given values.
 */
public class CalculateAverage
{

	public static void main(String[] args)
	{
		// int[] tan=new int [4];
		int[] totalvalues =
		{ 10, 20, 30, 40, 50, 60 };
		int indexofArray, number, sum = 0;

		for (indexofArray = 0; indexofArray < totalvalues.length; indexofArray++)
		{
			sum = sum + totalvalues[indexofArray];
		}
		System.out.println("print the sum of values: " + sum);

		int average = sum / totalvalues.length;

		System.out.println("print the average values: " + average);
	}
}
