import java.util.*;
public class P46CheckSpareMatrix
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [3][3];
		
		System.out.println("Enter the values in array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" printing the array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int zerocount=0;
		int nonzero=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
				{
					zerocount++;
				}
				else
				{
					nonzero++;
				}
			}
		}
		String s=zerocount>nonzero?"Sparse Matrix":"Not a spare matrix";
		System.out.println(s);
	}
}