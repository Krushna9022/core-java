public class Ptn33
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{  int a=1;
			for(int j=1;j<=9;j++)
			{
			     if(j<=10-(2*i-1))
				 {
					 System.out.print(a);
					if(j<6-i)
					{
						a++;
					}
					else
					{
						--a;
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