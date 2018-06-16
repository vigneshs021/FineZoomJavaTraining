package com.finezoom.javatraining.ioexception;

import java.util.Scanner;

public class FileThrow
{

	public static void main(String[] args)
	{
		
		
		mark(55);
	}

	public static void mark(int mark)
	{

		
		if (mark > 45)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
}
