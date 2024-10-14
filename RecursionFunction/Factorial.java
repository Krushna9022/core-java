import java.util.*;
public class Factorial
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		factorial(no,1,1); //calling
		
		
	}
	
	public static void factorial(int n ,int a,int p  //fef
	{
		if(n==a)
		{
			p*=a;
			System.out.println(p);
			return ;
		}
			p=p*a;
			factorial(n,a+1,p);
		
	}
}