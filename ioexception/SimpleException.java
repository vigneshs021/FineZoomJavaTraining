package com.finezoom.javatraining.ioexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimpleException
{
	public static void main(String[] args)
	{
		try{
		File file = new File("D://file//task.txt");
		
		FileReader fr = new FileReader(file);
		System.out.println("file found");
		}catch(FileNotFoundException e) 
		{
			System.out.println("file not found");
		}
	
		
	}

}
