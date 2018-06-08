package com.finezoom.javatraining.Array;

/**
 * program to find the common string elements in array.
 *
 */
public class CommonStringElements
{

	public static void main(String[] args)
	{
		
		String[] namelist1={"ram","vinoth","vishnu"};
		String[] namelist2={"ramu","vinoth","viswa","ram"};
		
		for (int i = 0; i < namelist1.length; i++)
		{
			for (int j = 0; j < namelist2.length; j++)
			{
				if (namelist1[i] == namelist2[j])
				{
					System.out.println(namelist1[i]);
				}
			}
		}

	}

}
