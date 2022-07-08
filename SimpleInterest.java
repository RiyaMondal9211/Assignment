import java.util.*;
public class SimpleInterest 
{  
   public static void main (String args[])  
   {   
	Scanner sc=new Scanner(System.in);
        float p, r, t, si;  		                      // principal amount, rate, time and simple interest respectively  
        
        System.out.print("Enter the principal amount: ");
        p=sc.nextFloat();
        
        System.out.print("Enter the rate: ");
        r=sc.nextFloat();

        System.out.print("Enter the time: ");
        t=sc.nextFloat(); 
                
        si = (p*r*t)/100;  
		   
        System.out.println("Simple Interest is: " +si);   // displaying the result
    }

}  
