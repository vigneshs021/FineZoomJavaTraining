package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * The program to Sort the given numbers and alphabets.
 */
public class SortNumericArray
{

	public static void main(String[] args)
	{
		int[] number =
		{ 1, 2, 3, 8, 5, 6 };
		int startnumber;

		for (startnumber = 0; startnumber < number.length; startnumber++)
		{
			System.out.println(number[startnumber]);
		}

		char[] alphabets =
		{ 'r', 'q', 's', 'd', 'f' };
		for (int startletter = 0; startletter < alphabets.length; startletter++)
		{
			System.out.println(alphabets[startletter]);
		}

	}

}
