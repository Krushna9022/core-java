class Ptn20HolloDiamond
{
	public static void main(String x[])
	{
		for (int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((j==6-i || j==4+i )&&i<=5)
				{ 
					System.out.print("*");
				} 
				else if((j==i-5 || j==15-i ) && i>5)
				{
					System.out.print("*");
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

/*
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
	*/