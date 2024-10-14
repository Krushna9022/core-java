import java.util.*;
import java.lang.*;
public class  Power{
public static void main(String x[])
{
Scanner sc= new Scanner(System.in);
//double a = 30;
//double b = 2;
//System.out.println(Math.pow(a, b));
System.out.println("enter the base number ");
 double num=sc.nextDouble();
 System.out.println("Enter the power/Index of number");
 double power=sc.nextDouble();
double y=Math.pow(num,power);
 System.out.println(num+"base to the power"+power+"is"+y);
}}