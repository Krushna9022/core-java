import java.util.*;
public class P17Palindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0,temp=a;
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if (rev==temp)
		{
			System.out.println("Palindrrome");
		}
		else
		{
			System.out.println(" Not Palindrrome ");
		}
	}
}