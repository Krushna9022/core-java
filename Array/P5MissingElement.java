import java.util.*;
public class P5MissingElement
{
	public static void main(String x[])
	{
		int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Entert the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		missingElement(a);
	}
	
	public static void missingElement(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(j+"\t");
			}
		}
	}
}