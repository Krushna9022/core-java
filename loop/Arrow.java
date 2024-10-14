public class Arrow
{
	public static void main(String x[])
	{
		System.out.println("=================Right Arrow =====================\n");
		for(int i=1;i<=9;i++)
		{
		  for(int j=1;j<=9;j++)
		  {
			if(i==5||(j==4+i&&i<=5)||(j==14-i &&i>4))
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
		
		
		System.out.println("============Left Arrow ==========================\n");
		for(int i=1;i<=9;i++)
		{
		  for(int j=1;j<=9;j++)
		  {
			if(i==5||(j==6-i && i<=5)||(j==i-4 && i>4))
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