public class  Pattern14InhalfPrymid
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{  int a=i;
			for (int j=1;j<=5;j++)
			{
				if(i==1||j==6-i||j==1)
				{
					System.out.print(a++);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}