import java.util.Scanner;

public class CalculateBMI
    {
    public static void main(String[] args)
        {
		
    	 float weight = 0,height = 0;
    	 float BMI;
    	 Scanner b = new Scanner(System.in);
    	 
    	 System.out.println("Enter the weight of person in kg");
    	 weight =b.nextFloat();
    	 
    	 System.out.println("Enter the height of person in cm");
    	 height =b.nextFloat();
    	 
    	 BMI=weight/height*height;
    	 
    	 
    	 System.out.println("Print the BMI value of person: "+BMI);
    	 
    	 
    	 
    	      
    	      if(BMI<18)
    	         {
    	    	  System.out.println("BMI of person is underweight");
    	         }
    	      else if(BMI<25)
    	         {
    	    	  System.out.println("BMI of person is normal");
    	         }
    	      else if(BMI<30)
    	          {
    	           System.out.println("BMI of person is overweight");
    	          }
    	      else
    	         {
    	    	  System.out.println("BMI of person is obese");
      	         }
    	      
           	}
        
}
