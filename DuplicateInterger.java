package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * Find duplicate or repeating integer value from the numbers.
 *
 */
public class DuplicateInterger
{
	public static void main(String[] args)
	{
		String[] value = new String[6];
		int index, parentindex;

		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for (index = 0; index < value.length; index++)
		{
			value[index] = ss.next();
		}

		for (parentindex = 0; parentindex < value.length; parentindex++)
		{
			for (int rootindex = parentindex + 1; rootindex < value.length; rootindex++)
			{

				if (value[parentindex].equals(value[rootindex]))
				{

					System.out.print(value[parentindex] + " ");
				}
			}
		}

	}
}
