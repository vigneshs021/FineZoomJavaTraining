package com.finezoom.javatraining.filesystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FSystem
{
	public static void main(String[] args) throws IOException
	{
		write();
	}
	
	
public static void write() throws IOException
{        
	FileReader frs= new FileReader("D:\\assignment\\task2.txt");
	BufferedReader brs = new BufferedReader(frs);
	
		FileWriter fw = new FileWriter("D:\\assignment\\task23.txt");
		PrintWriter pw =new PrintWriter(fw);
		
	//BufferedWriter bw = new BufferedWriter(fw);
	String count;
    while ((count = brs.readLine()) != null)
    {
    	pw.println(count);

    }
   
    
    pw.flush();
    
    pw.close();
}
}

	
	
