public class P44LowerTriangularMatrix
{
	public static void main(String x[])
	{
		int a[][]=new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Printing matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i>j)
				{
					a[i][j]=0;
				}
			}
		}
		
		System.out.println("Printing lower triangular matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
}