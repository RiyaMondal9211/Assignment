import java.util.*;
public class Rectangle
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        float breadth,length,area,perimeter;                      // variable declaration

        System.out.print("Enter the length: ");
        length=sc.nextFloat();

        System.out.print("Enter the breadth: ");
        breadth=sc.nextFloat();

        area=length*breadth;
        perimeter=2*(length+breadth);                                   // caculating area and breadth

        System.out.println("Area of Rectangle is: "+area);
        System.out.println("Perimeter of Rectangle is: "+perimeter);    // displaying area and breadth of Rectangle

       }

}

