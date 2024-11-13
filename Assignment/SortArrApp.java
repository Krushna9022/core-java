/*Q1 Write program to create class name as SortArr with two functions
void setArray(int a[]): this function can accept array as parameter
int [] getSortArray(): this function can perform sorting on array and return sorted array*/

import java.util.*;
public class SortArrApp
{
	public static void main (String x[])
	{
		SortArr sort=new SortArr();
		sort.setArray(new int[]{10,40,60,50,30,80,70});
		int [] res=sort.getSortArray();
		System.out.println("sorted array");
		for(int r :res)
		{
			System.out.println(r +" ");
		}
		
	}
}

class SortArr
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
		
		System.out.println("unsorted array");
		for(int r :a)
		{
			System.out.println(r +" ");
		}
	}
	public int[] getSortArray()
	{
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
		return a;
		
	}
	
	
}