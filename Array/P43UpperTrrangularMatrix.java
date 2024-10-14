public class P43UpperTrrangularMatrix
{
	public static void main(String x[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{6,7,8}};
		//printing matrix;
		System.out.println("matrix is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		// logic
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i<j)
				{
					a[i][j]=0;
				}
			}
		}
		//printing uppertriangular matrix
		System.out.println("upper triangular matrix is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}