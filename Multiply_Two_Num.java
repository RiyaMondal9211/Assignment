import java.util.*;
public class Multiply_Two_Num
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int num1,num2,product;                                                             //variable declaration

      System.out.print("Enter the first number: ");
      num1=sc.nextInt();

      System.out.print("Enter the second number: ");
      num2=sc.nextInt();

      product=num1*num2;                                                          //multiplication of numbers

      System.out.println("The product of given two numbers is: "+product);        //display the result

    }

}