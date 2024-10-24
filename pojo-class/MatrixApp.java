import java.util.*;
public class MatrixApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		int a[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		PrintMatrix matrix=new PrintMatrix();
		matrix.acceptMatrix(a);
		matrix.printMatix();
	}
}

class PrintMatrix
{
	
	int m[][];
	public void acceptMatrix(int m[][])
	{
		this.m=m;
	}
	public void printMatix()
	{
		System.out.println("=============printing matrix ============");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(m[i][j] +"\t");
			}
			System.out.println();
		}
	}
}