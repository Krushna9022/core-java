public class P46EqulaMatrix
{
	public static void main(String x[])
	{
		int a[][]={{1,2,3},{1,2,3},{1,2,3}};
		int b[][]={{1,2,3},{1,2,3}};
		
		
		boolean f=equalMatrix(a,b);
		if(f)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
	}
	public static boolean equalMatrix(int a[][],int b[][])
	{

		System.out.println("printing first matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("printing second matrix");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
				System.out.println();
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			
			for(int j=0;j<b[i].length;j++)
			{
				if(a[i].length!=b[i].length || a.length!=b.length)
				{
					return false;
				}
				if(a[i][j]!=b[i][j])
				{
					return false;
				}
			}
		}
		return true;
	}
}