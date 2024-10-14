import java.util.*;
public class Perfect
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=perfect(a,1,0);
		checkPerfect(a,sum);
	}
	
	public static int perfect(int a,int i,int sum)
	{
		if(i<a)
		{
			if(a%i==0)
			{
				sum+=i;
				//System.out.println(sum);
			}
			return perfect(a,i+1,sum);
		}
		return sum;
	}
	public static void checkPerfect(int a,int sum)
	{
		if(sum==a)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not perfect");
		}
	}
}