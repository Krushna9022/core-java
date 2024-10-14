public class Pattern3
{
	public static void main(String x[])
	{
	pattern(1,5);
	}
	
	public static void pattern(int x,int y)
	{
		if(x>=1 && x<=5)
		{
			if(y>=x)
			{
				System.out.print("*");
				pattern(x,y-1);
			}
			
			else
			{
				System.out.println();
				pattern(x+1,5);
			}
		}
	}
}