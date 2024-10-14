public class Love_Solid
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=i-2 && j<=12-i && i>=3)
				{
					System.out.print("*");
				}
				
				else if((j%5==2&&i==1) ||(j%5==3 && i==1)|| (i==2 && j!=5))
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