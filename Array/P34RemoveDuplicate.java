import java.util.*;
public class P34RemoveDuplicate
{
	public static void main(String x[])
	{
		int a[]={1,2,5,1,7,2,4,2};
		removeBySort(a);
	}
	
	public static void removeBySort(int a[])
	{
		//sort array
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
		int j=0;
		//remove duplicate;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		}
			a[j++]=a[a.length-1];
		
		for(int i=0;i<j;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}