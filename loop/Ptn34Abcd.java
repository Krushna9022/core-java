class Ptn34Abcd
{
	public static void main(String x[])
	{   int a=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
				System.out.printf("%c ",a++);
				}
			}
			System.out.println();
		}
	}
}