package com.finezoom.javatraining.Array;

import java.util.Scanner;

public class AverageExceptMaxAndMin
{

	public static void main(String[] args)
	{
		int[] maximum = new int[4];

		int index;
		int maximumvalue = 0;
		Scanner so = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for (index = 0; index < maximum.length; index++)
		{
			maximum[index] = so.nextInt();
		}

		for (index = 0; index < maximum.length; index++)
		{
			if (maximum[index] > maximumvalue)
			{
				maximumvalue = maximum[index];
			}

		}
		System.out.println("print the values of maximum:" + maximumvalue);
        
		
		int minimumValue =0;
		int minimum[] = null;

		

			for ( index = 0; index < minimum.length; index++)
			{
				if (minimum[index] < minimumValue)
				{
					minimumValue = minimum[index];
				}
			}

			System.out.println("minimumValue = " + minimumValue);
	}

}
