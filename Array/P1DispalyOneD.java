import java.util.*;
public class P1DispalyOneD
{
	public static void main(String x[])
	{
		int a[]=new int [5];
		Scanner sc=new  Scanner(System.in);
		System.out.println("\n enter the elements");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
			System.out.println(sum +"is sum of it");
		
	}
}