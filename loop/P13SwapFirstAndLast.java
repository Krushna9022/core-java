import java.util.Scanner;
class P13SwapFirstAndLast
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int ls=a%10;
		int f=a;
		int div=1;
		while(f>10)
		{
			f=f/10;
			div=div*10;
		}
		int mid=(a%div)/10;
		a=ls*div+mid*10+f;
		System.out.println(" swap number is "+ a);
	}
}