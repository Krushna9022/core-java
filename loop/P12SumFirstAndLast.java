import java.util.*;
class P12SumFirstAndLast
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int ls=a%10;
		while(a>10)
		{
			a=a/10;
		}
		System.out.println("fist digit "+a+" Last digit "+ls+" sum is " +(a+ls));
	}
}