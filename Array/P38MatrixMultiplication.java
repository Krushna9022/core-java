import java.util.*;
public class P38MatrixMultiplication
{
		public static void main(String x[])
		{	Scanner sc=new Scanner (System.in);
			int a[][]=new int[2][2];
			int b[][]=new int[2][2];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			int c[][]=new int[2][2];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					c[i][j]=0;
					for(int k=0;k<2;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
		}
}