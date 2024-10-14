//Swap number program
import java.util.Scanner;
public class SwapNum
{
public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter two numbers for swapping");
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println(" number before swapping");
  System.out.printf("\nvalue of A is %d \t value of b is %d",a,b);
   
//logic 1
 // a=a*b;
 // b=a/b;
 // a=a/b;

//logic2
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println(" number After swapping");
  System.out.printf("value of A is %d \t value of b is %d",a,b);
   

 }
}