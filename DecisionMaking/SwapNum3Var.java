//program to reverse the number using third variable
import java.util.*;
public class SwapNum3Var
{
public static void main(String x[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the two values ");
  int a=s.nextInt();
  int b=s.nextInt();
   int temp;
   temp=a;
   a=b;
   b=temp;
 System.out.println("A"+a+" B"+b);
 }
}
