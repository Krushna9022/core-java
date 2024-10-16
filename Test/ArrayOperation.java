import java.util.*;
public class ArrayOperation
{
	public static void main(String x[])
	{
		int a[]=new int[]{5732,8659,2534,9625,7354,1325};
		FunctionArray f=new FunctionArray();
		f.setArray(a);
		f.sortArray();
		f.SumofArray();
	}
}
 class FunctionArray
{
	int a[];
	public void setArray(int a[])
	{	
		this.a=a;
	}
	
	public void sortArray()
	{
		System.out.println("Sorted ofArray");
		for(int i=0;i<a.length;i++)
		{
		
			int n=a[i];
			int k=0;
			int b[]=new int[4];
			while(n!=0)
			{
			
				int rem=n%10;	
				b[k++]=rem;
				n=n/10; // System.out.print(rem);
			}
		
			
			Arrays.sort(b);
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[j]);
			}
			System.out.print(" ");
		}
	}
	
	public void SumofArray()
	{
		System.out.println("\nSum.ofArray");
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int sum=0;
			for(;n!=0;)
			{
				int rem=n%10;
				sum+=rem;
				n=n/10;
			}
			System.out.print(sum+" ");
			
		}
	}
}