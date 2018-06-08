package com.finezoom.javatraining.Array;

/**
 * Print the grid.
 */
public class Grid
{
	public static void main(String[] args)
	{
		int[][] grid = new int[5][7];
		int row, column;
		for (row = 0; row < 5; row++)
		{
			for (column = 0; column < 7; column++)
			{
				System.out.printf( "*",grid[row][column]);
			}
			System.out.println();
		}
	}
}
