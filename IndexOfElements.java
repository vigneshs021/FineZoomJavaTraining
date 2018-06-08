package com.finezoom.javatraining.Array;

/**
 * This program is used to find index position of elements.
 *
 */
public class IndexOfElements
{

	public static void main(String[] args)
	{
		int index = 0;

		int position, number[] =
		{ 3, 4, 5, 6, 7, 5, 5, 6, 2, 5, 89 };

		for (position = 0; position < number.length; position++)
		{
			if (number[position] == 2)
			{

				index = position;
			}
		}
		System.out.println("print the index of elements: " + index);
	}
}
