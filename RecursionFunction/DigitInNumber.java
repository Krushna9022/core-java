import java.util.*;
public class DigitInNumber
{
	static boolean b=false;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the digit ");
		int d=sc.nextInt();
		
		boolean b=digitSearch(n,d);	
		if(b)
		{
			System.out.println("digit found");
		}
		else{
			System.out.println("digit not found");
		}
	}
	
	public static boolean digitSearch(int n,int s)
	{
		if(n>0)
		{
			int rem=n%10;
			if(rem==s)
			{
				return true;
			}
			else
			{
				return digitSearch(n/10,s);
			}
		}
		else{
			return false;
		}
	}
}