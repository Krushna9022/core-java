public class Ptn25PascalTriangle
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{   int num=1;
			for(int j=1;j<=7;j++)
			{
				if(j<=i)
				{
					System.out.print(num+" ");
					num=num*(i-j)/j;
				}
			}
			System.out.println();
		}
	}
}