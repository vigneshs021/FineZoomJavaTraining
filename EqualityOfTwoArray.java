package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * To find given two array is equal or not.
 */
public class EqualityOfTwoArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int length1, length2, i;
		boolean dummy = false;

		System.out.println("Enter length of array");
		length1 = scan.nextInt();

		int[] test1 = new int[length1];

		System.out.println("Enter the array values");
		for (i = 0; i < length1; i++)
		{
			test1[i] = scan.nextInt();
		}

		System.out.println("Enter length of array");
		length2 = scan.nextInt();

		int[] test2 = new int[length2];

		System.out.println("Enter the  array values");
		for (i = 0; i < length2; i++)
		{
			test2[i] = scan.nextInt();
		}

		if (length1 != length2)
		{
			System.out.println("The two array are  not equal");
		}
		{
			for (i = 0; i < length1; i++)
			{
				if (test1[i] == test2[i])
				{
					dummy = true;

				}

			}
			if (dummy)
			{
				System.out.println("the array are equal");
			}

		}
	}
}
