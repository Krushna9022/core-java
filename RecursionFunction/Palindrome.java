import java.util.Scanner;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=revNum(num,0);
		System.out.println( "rev of num is "+sum);
		checkpalindrome(num,sum);
	}
	 
	public static int  revNum(int n ,int rev)
	{ 
		if(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			return revNum(n/10,rev);
			//System.out.print(rev);
		}	
			return rev ;
		
		
	}
	public static void  checkpalindrome(int num,int sum)
	{
		if (num==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println( " NOT  palindrome");
		}
		
	}
}