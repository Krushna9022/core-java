import java.util.Scanner;
class P27SumOfPrimeNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,sum=0;
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{   int temp=i,count=0;
			for(j=1;j<=i;j++)
			{
				if(temp%j==0)
				{ count++;
				}
			}
			if(count==2)
			{  sum=sum+i;
				
			}
	 // System.out.println(sum);		
		}
	  System.out.println(sum);		
	}
}