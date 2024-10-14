import java.util.*;
public class Factors
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		factor(a,1);
	}
	public static void factor(int n,int a)
	{
		if(a<=n)
		{
			if(n%a==0)
			{
				System.out.print(a+" ");
			}
			factor(n,a+1);
		}
	}
}
