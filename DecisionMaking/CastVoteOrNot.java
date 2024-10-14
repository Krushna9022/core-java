import java.util.Scanner;
public class CastVoteOrNot
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age ");
int a=sc.nextInt();
 
 String s=a>18?"Can vote":"not vote";
 

 System.out.println(s);

}
}
