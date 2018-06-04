import java.util.Scanner;

public class ConvertToString
{

	  public static void main(String[] args)
	  {
		  
		  long a=0;
		   
		  Scanner na=new Scanner(System.in);
			System.out.println("Enter the long value of a: ");
			a=na.nextLong();
			
			 String n=String.valueOf (a);
			 
		  System.out.println("print the value of n: "+n);
		  
	}
}
