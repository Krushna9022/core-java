import java.util.Scanner;
public class PalindroneOrNOt
{
public static void main(String x[])
{
int a,rem,rev;
Scanner sc=new Scanner (System.in);
System.out.println("Enter the three digit number");
 a= sc.nextInt();
 int temp=0;
 a=temp;
 a=((a%10)*100)+((a/10)*10)+a/100;
 String s=a==temp?"palindrone":"Not";
System.out.println("Number is  "+s);
}
}