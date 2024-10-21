import java.util.*;
public class SumApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1 ");
		int a=sc.nextInt();
		System.out.println("Enter the number2 ");
		int b=sc.nextInt();
		Sum s=new Sum();
		
		System.out.println("Sum of number is "+s.calSum(a,b));
	}
}

class Sum
{
	public int calSum(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
}