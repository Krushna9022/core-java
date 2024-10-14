public class P41SumOfRightDiagOfMatrix
{
	public static void main(String x[])
	{
		int a[][]={{1,2,3},{4,0,6},{7,8,9}};
		System.out.println("printiing array");
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				
				if(i+j==2)
				{
					sum1+=a[i][j];
				}
			}
			System.out.println();
		}
		
			System.out.println("sum of left diagonal is "+sum1);
		
		
	}
}