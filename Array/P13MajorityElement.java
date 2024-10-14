import java.util.*;
public class P13MajorityElement
{
	public static void main(String x[])
	{
		int a[]={2,2,1,1,1,1};
		//brute force method
		//BruteForce(a);
		//optial method.
		//optimal(a);
		
		//method3 moore's voting algorithms
		mooresAlgo(a);
		
	}
	
	public static void BruteForce(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
				int c=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						c++;
					}
					
				}
			  if(c>a.length/2)
			{
				System.out.print(a[i]+" ");
				break;
			}
		}
	}
	
	public static void optimal(int a[])
	{
		// sorting array
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//logic to find majority;
		int count=1,m=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				count++;
			}
			else
			{
				count=1;
				m=a[i];
			}
			if(count>a.length/2)
			{
				System.out.println(a[i]);
			}
			
		}
	}
	
	public static void mooresAlgo(int a[])
	{
		int count=0; 
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			if(count==0)
			{
				m=a[i];
			}
			if(m==a[i])
			{count++;}
			else
			{count--;}
		}
		System.out.print(m);
	}
}