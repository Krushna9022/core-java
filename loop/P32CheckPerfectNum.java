import java.util.Scanner;
public class P32CheckPerfectNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
			
		}
		
		if(sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}
}