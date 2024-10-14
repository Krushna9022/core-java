public class Ptn17fullNumRev
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.print(a);
					if(j<5)
					{++a;}
					else
					{--a;}
				}
				else{
					System.out.print(" ");
				}
			}
		  System.out.println();	
		}
	}
}

/*
  1
   121
  12321
 1234321
123454321
*/