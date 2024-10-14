import java.util.Scanner;
public class AsciiValue
{ public static void main(String x[])
{
 Scanner sc=new Scanner (System.in);
System.out.println("Enter the character to check the value");
char c=sc.next().charAt(0);
int value=c;
System.out.println(c+" "+ value);

}}