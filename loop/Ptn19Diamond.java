class Ptn19Diamond
{
	public static void main(String x[])
	{
		boolean flag=true;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				
				if((j>=i-4 && j<=15-i && flag && i>5)||(j>=6-i&&j<=4+i &&flag &&i<=5) )
				{
					System.out.print("*");
					flag=false;;
				}
				else
				{
				System.out.print(" ");
				flag=true;
				}
			}
			System.out.println();
		}
	}
}

/*

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
	*/