package com.finezoom.javatraining.Array;

import java.util.ArrayList;

/**
 *common elements from three sorted (in non-decreasing order) arrays.
 *
 */
public class ThreeSortedElements
{

	public static void main(String[] args)
	{
		ArrayList<Integer> common = new ArrayList<Integer>();
		   int array1[] = {2, 4, 8};
		   int array2[] = {2, 3, 4, 8, 10, 16};
		   int array3[] = {4, 8, 14, 40};
			int i=0,j=0,k=0;
			while (i < array1.length && j < array2.length && k < array3.length) 
			{
				if (array1[i] == array2[j] && array2[j] == array3[k])
				{
					common.add(array1[i]);
					i++;
					j++;
					k++;
				}
				else if (array1[i] < array2[j])
					i++;
				else if (array2[j] < array3[k])
					j++;
				else
					k++;
			}
			System.out.println("the elements from common three sorted in ( non-decreasing order ) arrays: ");
		System.out.println(common);
		}
	}


