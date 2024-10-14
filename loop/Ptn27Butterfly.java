class Ptn27Butterfly
{
	public static void main(String x[])
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if((j<=i || j>=11-i)&& i<=5)
				{
					System.out.print("*");
				}
				else if((j>=i||j<=11-i )&& i>5)
				{
					System.out.print("*");
				}
				
				// if((j>=12-i && j<=i-1&&i>=7)||(j>=i+1 &&j<=10-i && i<=4))
				// {
					// System.out.print(" ");
				// }
				else
				{
					System.out.print(" ");
				}
			}
		  System.out.println();	
		}
	}
}