import java.util.*;
public class Primecheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		checkPrime(a,2);
		//																																																																				checkPrime(6,2);
	}
	public static void   checkPrime(int n,int i)
	{
		if(i<n)
		{
			if(n%i==0)
			{
			  System.out.println("not prime");
			  return ;
			}
			 checkPrime(n,i+1);
		}
		//return 0;
		
		else
		{
			System.out.println("prime");
		}
		//return 0;
		
	}
}	