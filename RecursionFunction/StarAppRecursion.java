import java.util.*;
class StarAppRecursion
{
	static int ic , jc;
	public static void main(String x[])
	{
		i(0);
	}
	public static void i(int a)
	{
		
		if(a==5)
		{
			return;
		}
			i(++a);
			j(1,a);
			System.out.println();
		
	}
	public static void j(int j,int a)
	{
		if(j<=5)
		{
			if(j>=1-a && j<= 2)
			{
				System.out.print("* ");
				j(++j,a);
			}
			else
			{
				System.out.print("  ");
				j(++j,a);
			}
		}
	}
}