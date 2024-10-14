import java.util.Scanner;
class P15SumOfDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int prod=1;
		while(a>0)
		{
			int rem=a%10;
			prod=prod *rem;
			a=a/10;
		}
		System.out.print("prod is "+ prod );
	}
}