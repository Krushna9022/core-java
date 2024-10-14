import java.util.*;
public class DuckNum
{ static boolean b =false;
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
	    boolean b=duckNum(n);
		if(b)
		{
			System.out.println("duck number");
		}
		else{
			System.out.println("NOt duck number");
		}
	}
	
	public static boolean duckNum(int n)
	{
		if(n!=0)
		{
			int rem=n%10;
			if(rem==0)
			{
				return true;
			}
			else
			{
				return duckNum(n/10);
			}
		}
		else
		{
			return false;
		}
	}
}