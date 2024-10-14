public class PrimeNumber
{
	public static void main(String x[])
	{ int n=1;
		int a=50,count=0;
		while(n<=a)
		{
			for (int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(" "+n);
			}
			count=0;
			n++;
		}
		
	}
}