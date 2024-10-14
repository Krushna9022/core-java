public class Ptn23
{
	public static void main(String x[])
	{
		for(int i=1;i<=8;i++)
		{  int a=i;
			for(int j=1;j<=4;j++)
			{
				if(j<=i &&i<=4)
				{
					System.out.print(i);
					if(j<i)
					{
						System.out.print("*");
					}
				}
				else if(j<=9-i && i>4)
				{
					System.out.print(9-i);
					if(j<9-i)
					{
						System.out.print("*");
					}
				}
			}
		 System.out.println();	
		}
	}
}