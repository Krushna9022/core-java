import java.util.*;
public class LeapYearOrNot
{
public static void main(String x[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the year");
int  a=sc.nextInt();

String s=a%4==0?"leap year":"not leap year";
System.out.println(s);
}
}