public class Ptn31Rev
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{  int a=1;
			for(int j=1;j<=10;j++)
			{
				if(j<=i || j>=11-i)
				{
					
					if(j<=i)
					{
						System.out.print(a++);
					}
					else
					{
						System.out.print(--a);
						
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}