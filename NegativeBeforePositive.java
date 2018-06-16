package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 *print the negative values before the positive values.
 *
 */
public class NegativeBeforePositive
{

	public static void main(String[] args)
	{
		Scanner neg = new Scanner(System.in);
		int[] Value = new int[3];
		int i = 0;

		System.out.println("Enter the input value");
		for (i = 0; i < Value.length; i++)
		{
			Value[i] = neg.nextInt();
		}
		System.out.println("Arrange the negative and positive values ");
		for (i = 0; i < Value.length; i++)
		{
			if (Value[i] < 0)
			{
				System.out.println(Value[i]);
			}
		}
		for (i = 0; i < Value.length; i++)
		{
			if (Value[i] > 0)
			{
				System.out.println(Value[i]);
			}
		}

	}

}
