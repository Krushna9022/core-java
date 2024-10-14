public class EvenOdd
{
	public static void main(String x[])
	{
		int n=10;
		//printEven(n,1);
		//System.out.println();	
		//printOdd(n,1);
		int a=sumEven(1,10,0);
		System.out.println("Sum of Even "+a);
		sumOdd(1,10,0);
	}
	
	public static void  printEven(int n,int a)
	{
		if(a<=n)
		{
			if(a%2==0)
			{
			System.out.print(a+" ");
			}
			printEven(n,a+1);
		}
	}
	public static void printOdd(int n,int a)
	{
		if(a<=n)
		{
			if(a%2==1)
			{
				System.out.println(a+" ");
			}
			printOdd(n,a+1);
		}
	}
	
	public static int  sumEven(int a,int n,int sum )
	{
		if(a<=n)
		{
			if(a%2==0)
			{
				sum=sum+a;
				
			}
			return sumEven(a+1,n,sum);
		}
			return sum;	
		
	}
	
	public static int  sumOdd(int a,int n,int sum)
	{
		if(a<=n)
		{
			if(a%2==1)
			{
				sum=sum+a;
			}
			return sumOdd(a+1,n,sum);
		}
		System.out.print(sum);
		return 0;
		
	}

}