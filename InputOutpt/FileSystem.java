package com.finezoom.javatraining.filesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileSystem
{
	public static void main(String[] args) throws IOException
	{
		fileread();
		FSystem rr=new FSystem();
		rr.write();
	}
public static void fileread() throws IOException
{
	FileReader fr= new FileReader("D:\\assignment\\task2.txt");
	BufferedReader br = new BufferedReader(fr);
	
	

	
	while(br.readLine()!=null)
	{
		br.readLine();
		System.out.println(br.readLine());
		

	}
	
	
	
}
    
}
