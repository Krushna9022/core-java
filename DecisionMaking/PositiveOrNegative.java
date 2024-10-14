import java.util.Scanner;
public class PositiveOrNegative
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number ");
int a=sc.nextInt();
 
 String s=a>0?"positive":"negative";
 

 System.out.println(s);

}
}
