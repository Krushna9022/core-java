import java.util.Scanner;
public class P26PrimeOrNotM1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n,i,count=0;
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n +" is Prime Number");
		}
		else
		{
			System.out.println(n +" is not  Prime Number");
		}
		
	}
}