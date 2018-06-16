package com.finezoom.javatraining.ioexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead
{
	public static void main(String[] args)
	{
		
		try
		{
			FileRead fr =new FileRead();
			fr.read();
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("file not found");
		}finally
		{
			System.out.println("completed");
		}
	}
	 public void read() throws FileNotFoundException
	 {
		 File file = new File("D://file//task.txt");
			
			FileReader fr = new FileReader(file);
			System.out.println("file found");
	 }

}
