import java.util.*;
 public class Palindrone
{
  public static void main(String x[])
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 int no=(a%10)*100+((a/10)%10)*10+a/100;
	 if (a==no)
	  System.out.println("palindrone");
	 else
	 System.out.println("Not palindrone");
	 
  }
}