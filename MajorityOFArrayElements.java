package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * find the majority of elements in the given array.
 */
public class MajorityOFArrayElements
{

	public static void main(String[] args)
	{
		int[] element = new int[4];
		int i, j, temp = 0;
		int value = element.length / 2;
		Scanner Majorelement = new Scanner(System.in);

		System.out.println("enter the values");
		for (i = 0; i < element.length; i++)
		{
			element[i] = Majorelement.nextInt();
		}
		for (i = 0; i < element.length; i++)
		{
			for (j = i + 1; j < element.length; j++)
			{
				if (element[i] == element[j])
				{
					temp = temp + 1;
				}
			}

		}

		if (temp > value)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
