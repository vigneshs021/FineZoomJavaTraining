package com.finezoom.javatraining.Array;

import java.util.Scanner;

/**
 * sum of two matrices.
 */
public class SumOfMatrices
{
	public static void main(String[] args)
	{
		int m, n;
		Scanner get = new Scanner(System.in);
		System.out.print("Enter Number of Rows and Colomns:");
		m = get.nextInt();
		n = get.nextInt();

		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int third[][] = new int[m][n];

		// first matrix values
		System.out.println("Enter First Matrix Elements:");
		for (int row = 0; row < m; row++)
		{
			for (int column = 0; column < n; column++)
			{
				first[row][column] = get.nextInt();
			}
		}
		// first matrix values
		System.out.println("Enter Second Matrix Elements:");
		for (int row = 0; row < m; row++)
		{
			for (int column = 0; column < n; column++)
			{
				second[row][column] = get.nextInt();
			}
		}
		// sum the matrix
		for (int row = 0; row < m; row++)
		{
			for (int column = 0; column < n; column++)
			{
				third[row][column] = first[row][column] + second[row][column];
			}
		}
		System.out.println("Sum of Two Matrices:");
		for (int row = 0; row < m; row++)
		{
			for (int column = 0; column < n; column++)
			{
				System.out.print(third[row][column] + "\t");
			}
			System.out.println();
		}

	}
}
