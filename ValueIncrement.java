import java.util.Scanner;

public class ValueIncrement 
   {
    
	public static void main(String[] args) 
	   {
		   
		  int m,number=0;
		  
		  Scanner sc = new Scanner(System.in); 
		
		  System.out.println("Enter the values of number:");
		  number=sc.nextInt();
		
		  m=number*number*number;
		  System.out.println("print the value of m "+m);
		
//sum into thrice		  
		  m=number+number+number;
		  System.out.println("print the value of m "+m);
	   }
}
