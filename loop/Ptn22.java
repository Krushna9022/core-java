public class Ptn22
{
	public static  void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i && i<=4 )
				{
					System.out.print(i+2);
				}
				else if(j<=8-i && i>4)
				{
					System.out.print(10-i);
				}
			}
			System.out.println();
		}
	}
}