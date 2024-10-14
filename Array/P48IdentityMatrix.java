import java.util.*;
public class P48IdentityMatrix
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int b[][]={{1,0,0},{0,5,0},{0,0,1}};
		int a[][]=new int [3][3];
		
		System.out.println("Enter the values in array");
		
		// for(int i=0;i<a.length;i++)
		// {
		// 	for(int j=0;j<a[i].length;j++)
		// 	{
		// 		a[i][j]=sc.nextInt();
		// 	}
		// }
		
		boolean f =identityMatrix(b);
		if(f)
		{
			System.out.println("Matrix ix identity ");
		}
		else 
		{
			System.out.println("Matrix is not identity");
		}
		
		
	}
	
	public static boolean identityMatrix(int a[][])
	{
		
		System.out.println(" printing the array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("comparing matrix");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a.length!=a[i].length)
				{
					System.out.println(" not square matrix ");
					return false;
				}

				if((i!=j && a[i][j]!=0 ))
				{
					System.out.println("non-diagonal is not zero (0)");
					return false;
				}
				else if((a[i][j]!=1 && i==j) )
				{
					System.out.print("diagonal is not one (1)");
					return false;
				}
				
			}
		}
		return true;
	}
}