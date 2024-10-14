public class checkArmstrong
{
	public static void main(String x[])
	{
		int num=153;
		int c=count(num,0);
		System.out.println("count is"+c);
		int sum=sumNum(num,c,0);
		System.out.println(sum);
		check(num,sum);
	}
	
	public static int count(int num,int c)
	{
		if(num!=0)
		{
			c++;
			return count(num/10,c);
		}
		return c;
	}
	
	public static int sumNum(int num,int c,int sum)
	{
		if(num!=0)
		{
			int rem=num%10;
			sum+=Math.pow(rem,c);
			return sumNum(num/10,c,sum);
		}
		return sum;
	}
	public static void check(int num,int sum)
	{
	if(sum==num)
	{
	System.out.println("Armstrong number");
	}
	else
	{
		System.out.println(" not Armstrong number");
	}
	}
}