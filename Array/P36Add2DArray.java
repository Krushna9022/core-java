import java.util.*;
public class P36Add2DArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [2][2];
		System.out.println("Enter the element of Array1:--");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the element of Array2:--");
		int b[][]=new int [2][2];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		addArray(a,b);
	}
	
	public static void addArray(int a[][],int b[][])
	{
		int c[][]=new int [2][2];
		System.out.println("Additon of the Array is :--");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}