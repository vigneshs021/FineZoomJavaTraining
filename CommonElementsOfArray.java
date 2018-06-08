package com.finezoom.javatraining.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * compare the two integer array and  find the common elements in it. 
 *
 */
public class CommonElementsOfArray
{
	public static void main(String[] args)
	{
		int[] number1 =
		{ 5, 6, 21, 3, 8, 9, 49, 1 };
		int[] number2 =
		{ 5, 66, 21, 35, 49 };

		for (int i = 0; i < number1.length; i++)
		{
			for (int j = 0; j < number2.length; j++)
			{
				if (number1[i] == number2[j])
				{
					System.out.println(number1[i]);
				}
			}
		}

	}
}
