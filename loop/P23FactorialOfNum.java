import java.util.Scanner;
public class P23FactorialOfNum
{
	public static void main(String x[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial of it");
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		System.out.println("Factorial of num "+n +"is "+ prod);
	}
}