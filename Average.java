import java.util.*;
public class Average
{
   public static void main(String args[])
   {

      Scanner sc=new Scanner(System.in);
      float beng,eng,math,sci,his,total,avg;                            // Variable declaration

      System.out.print("Enter the marks of Bengali: ");
      beng=sc.nextFloat();

      System.out.print("Enter the marks of English: ");
      eng=sc.nextFloat();

      System.out.print("Enter the marks of Math: ");
      math=sc.nextFloat();

      System.out.print("Enter the marks of Science: ");
      sci=sc.nextFloat();

      System.out.print("Enter the marks of History: ");
      his=sc.nextFloat();

      total=beng+eng+math+sci+his;                                 // Calculation of total

      avg=total/5;                                               // Calculation of average

      System.out.println("Total= "+total);                      // Displaying total and average of marks
      System.out.println("Average= "+avg);

    }

}
