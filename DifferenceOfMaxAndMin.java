package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * difference between the maximum and minimum values of integer.
 */
public class DifferenceOfMaxAndMin
{
	public static void main(String[] args)
	{
		int[] value = new int[2];
		int i;
		int maximum = 0, minimum = 0, difference = 0;
		Scanner mm = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for (i = 0; i < value.length; i++)
		{
			value[i] = mm.nextInt();
		}
		for (i = 0; i < value.length; i++)
		{
			if (value[i] > maximum)
			{
				maximum = value[i];
			}
			else if (value[i] < maximum)
			{
				minimum = value[i];
			}
			;
		}
		System.out.println("print the difference value of maximum and minimum :" + (maximum - minimum));

	}
}
