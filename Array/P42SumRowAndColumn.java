public class P42SumRowAndColumn
{
	public static void main(String x[])
	{
		int a[][]={{1,2},{3,4}};
		int c1=0,c2=0;
		for(int i=0;i<a.length;i++)
		{	int r1=0;
			for(int j=0;j<a[i].length;j++)
			{
				r1=r1+a[i][j];
				if(j==0)
				{
					c1+=a[i][j];
				}
				if(j==1)
				{
					c2+=a[i][j];
				}
			}
			System.out.print(r1);
		}
			
			
			System.out.println(c1);
			System.out.println(c2);
			
	}
}