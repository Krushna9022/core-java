public class Ptn24
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{	int a=1;
			for(int j=1;j<=5;j++)
			{
				if(j<=2*i-1 && i<=3)
				{  System.out.print(a);
					if(j<i )
					{
						a++;
					}
					else
					{
						a--;
					}
					
				}
				else if(j<=10-2*i-1  && i>=4)
				{
					System.out.print(a);
					if(j<6-i )
					{
						a++;
					}
					else
					{
						a--;
					}
						
				}
			}
		  System.out.println();
			
		}
	}
}