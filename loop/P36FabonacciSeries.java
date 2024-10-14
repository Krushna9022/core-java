import java.util.Scanner;
class P36FabonacciSeries
{
	public static void main(String x[])
	{  
		int a,b,c,n;
		n=100;
		a=0;
		b=1;
		for(a=0;a<=n;)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}