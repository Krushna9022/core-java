//method2
import java.util.Scanner;
public class P26PrimeOrNotM2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n,i;
		boolean flag=true;
		n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(n +" is Prime Number");
		}
		else
		{
			System.out.println(n +" is not  Prime Number");
		}
		
	}
}