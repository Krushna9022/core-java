import java.util.*;
public class Count
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println(countNum(a,0));
		
		countNum1(100,0);
	}
	
	public static int  countNum(int a,int count)
	{
		if(a!=0)
		{
			count++;
			return countNum(a/10,count);
		}
		return count;
		
	}
	
		public static void countNum1(int a,int count)
		{
			if(a==0)
			{
				System.out.print(count);
				return;
			}
			count++;
			countNum1(a/10,count);
		}
}