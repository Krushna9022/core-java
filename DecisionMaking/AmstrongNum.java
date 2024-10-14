 import java.util.*;
 public class AmstrongNum
{
  public static void main(String x[])
  {
	  int rem;
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 int temp=a;
	 rem=a%10;
	 a=a/10;
	 
	 int no=rem*rem*rem;
	 rem=a%10;
	 a=a/10;
	 no=no+(rem*rem*rem)+(a*a*a);
	 if(temp==no)
	 {
		  System.out.println("Amstrong");
	 }
	 else
	 {
		  System.out.println("not amstrong");
	 }
	 
  }
}