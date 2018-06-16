package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * print the positive values before the negative values.
 */
public class PositiveBeforeNegative
{

	public static void main(String[] args)
	{

		Scanner pos = new Scanner(System.in);
		int[] Value = new int[3];
		int i = 0;

		System.out.println("Enter the input value");
		for (i = 0; i < Value.length; i++)
		{
			Value[i] = pos.nextInt();
		}
		System.out.println("Arrange the negative and positive values ");
		for (i = 0; i < Value.length; i++)
		{
			if (Value[i] > 0)
			{
				System.out.println(Value[i]);
			}
		}
		for (i = 0; i < Value.length; i++)
		{
			if (Value[i] < 0)
			{
				System.out.println(Value[i]);
			}
		}
	}

}
