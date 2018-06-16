package com.finezoom.javatraining.filesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;

public class StreamRead
{
	public static void main(String[] args) throws IOException
	{
		readstreamfile();
	}
	public static void readstreamfile() throws IOException
	{
		
		
		FileInputStream inputfile = new FileInputStream("D:\\assignment\\name.txt");
		InputStreamReader read = new InputStreamReader(inputfile);
		int s=read.read();
		
		FileOutputStream fw = new FileOutputStream("D:\\assignment\\nameww.txt");
		OutputStreamWriter pw =new OutputStreamWriter(fw);
		
	//BufferedWriter bw = new BufferedWriter(fw);
	/*String count;
    while ((count = brs.readLine()) != null)
    {
    	pw.println(count);

    }*/
   
    
		
		while(s!=-1)
		{
			char b = (char) s;
			System.out.print(b);
			//System.out.println("success");
			s=read.read();
	    	pw.write(b);
		}
		read.close();
		pw.close();
	}
	
}
