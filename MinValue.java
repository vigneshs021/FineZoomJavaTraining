package com.finezoom.javatraining.Array;

/**
 * This program is used to calculate minimum values.
 *
 */
public class MinValue
{
	public static void main(String[] args)
	{

		int[] minimum =
		{ 2, 4, 6, 8, 10 };

		int minimumValue = Integer.MAX_VALUE;

		for (int index = 0; index < minimum.length; index++)
		{
			if (minimum[index] < minimumValue)
			{
				minimumValue = minimum[index];
			}
		}

		System.out.println("minimumValue = " + minimumValue);
	}
}
