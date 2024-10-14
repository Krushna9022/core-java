import java.util.Scanner;
class P14SumOfDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.print("sum is "+sum );
	}
}