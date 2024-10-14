public class LOVE
{
	public static void main(String x[]) throws Exception
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((j==i-2 && i>=3)||(j==12-i && i>=3))
				{
					System.out.print("*");
					Thread.sleep(100);
					
				}
				else if((j%5==2 && i==1)||(j%5==3 && i==1)||(j%5==4 && i==2)||(j%5==1&& i==2)||(j==5&& i==3))
			
				{
					System.out.print("*");
					Thread.sleep(100);
				}
				else
				{
					System.out.print(" ");
					Thread.sleep(100);
				}
			}
		 System.out.println();	
		}
		
		
	}
	
}