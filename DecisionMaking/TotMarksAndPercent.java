///program to calculate the total marks and percentage
import java.util.Scanner;
public class TotMarksAndPercent
{
public static void main(String x[])
 { 
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the marks of 5 Subject ");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  int e=sc.nextInt();
  int total=a+b+c+d+e;
 float percent=(total*100)/500;
  System.out.printf("\n total marks= %d /n percentage=%f",total,percent);
 
 }
}