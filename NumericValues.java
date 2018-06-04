import java.util.Scanner;

public class NumericValues 
  {
        public static void main(String[] args)  
          {
			
        	int number;
        	char n=0;
        	Scanner f = new Scanner(System.in);
        	
        	System.out.println("Enter the number to convert into words:");
        	number =f.nextInt();
        	
      //display ASCII value  	
        	n=(char)number;
        	System.out.println("print the value of number: "+n);
        	
		  }
  }
            