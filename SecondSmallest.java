package com.finezoom.javatraining.Array;

/**
 * Find the second smallest value in the given values.
 */
public class SecondSmallest
{
	public static void main(String[] args)
	{

		int[] value =
		{ 5, 6, 2, 9, 4, 3, 1, 8, 7 };
		int index, subindex, duplicate;

		for (index = 0; index < value.length; index++)
		{
			for (subindex = 0; subindex < value.length; subindex++)
			{
				if (value[index] > value[subindex])
				{
					duplicate = value[index];
					value[index] = value[subindex];
					value[subindex] = duplicate;
				}
			}
		}
		System.out.println("print the values of second samllest:" + value[1]);
	}
}
