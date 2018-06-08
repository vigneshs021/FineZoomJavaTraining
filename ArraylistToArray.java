package com.finezoom.javatraining.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *program to convert the ArrayList values into a Array
 *
 */
public class ArraylistToArray
{
	public static void main(String[] args)
	{

		ArrayList<String> list = new ArrayList<String>();

		list.add("balu");
		list.add("raja");
		list.add("ram");
		list.add("babu");
		list.add("      ");

		String[] name = list.toArray(new String[list.size()]);

		System.out.println(Arrays.toString(name));
	}
}
