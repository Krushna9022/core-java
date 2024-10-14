public class Ptn21SolidHalfDiamond
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((j<=i&&i<=5)||(j<=10-i &&i>5))
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

/*
*
**
***
****
*****
****
***
**
*
*/