class Ptn310101
{
	public static void main(String x[])
	{
		boolean flag=true;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<=i || j>=11-i)
				{
					if(j<=i)
					{
						if(j%2==1)
						{
							System.out.print("1");
						}
						else
						{
							System.out.print("0");
						}
					}
					else if (j>=11-i)
					{
						if(flag)
						{
							System.out.print("0");
							flag=false;
						}
						else
						{
							System.out.print("1");
							flag=true;
						}
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