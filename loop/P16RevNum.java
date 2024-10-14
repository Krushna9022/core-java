import java.util.*;
public class P16RevNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0;
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("Rev num is"+rev);
	}
}