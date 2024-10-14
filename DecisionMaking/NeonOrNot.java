import java.util.Scanner;
public class NeonOrNot
{
public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number 0-9");
 int no=sc.nextInt();
 int sq= no*no;
 int rem=sq%10;
 int qu=sq/10;
 int res=rem+qu;
 String s=no==res?"neon":"NotNeon";
 System.out.println(s);
 }
}
