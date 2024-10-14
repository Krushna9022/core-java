import java.util.*;
public class P39TransposeOfMatrixArray
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		//input from user
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();	
			}
		}
		
		int b[][]=new int[3][3];//created 2 array
		//transpose the elemet
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];	
			}
		}
		System.out.println("printing Origin matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
		
		System.out.println("printing transpose matrix");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");	
			}
			System.out.println();
		}
	}
}