package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * to find the given number is odd or even.
 */
public class OddOrEven
{
	public static void main(String[] args)
	{
		int[] totalvalues = new int[5];
		int number, count = 0, temp = 0;

		Scanner find = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for (number = 0; number < totalvalues.length; number++)
		{
			totalvalues[number] = find.nextInt();
		}
		for (int index = 0; index < totalvalues.length; index++)
		{
			if (totalvalues[index] % 2 == 0)
			{
				System.out.println("print the values of even numbers:" + totalvalues[index]);
				count = count + 1;
			}
			else
			{
				System.out.println("print the values of odd numbers:" + totalvalues[index]);
				temp = temp + 1;
			}
		}
	}
}
