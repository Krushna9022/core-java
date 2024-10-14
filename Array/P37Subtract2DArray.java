import java.util.Scanner;
public class P37Subtract2DArray
{
	public static void  main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first Array");
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the second Array");
		int b[][]=new int[3][3];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		subtractArray(a,b);
	}
	
	public static void subtractArray(int a[][],int b[][])
	{
		System.out.println(" first Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("second Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		int c[][]=new int[3][3];
		
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=b[i][j] - a[i][j];
				//System.out.print(c[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println("Subtracted Array is:--");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			
				System.out.print(c[i][j]+"  ");	
			}
			System.out.println();
		}
		
	}
}