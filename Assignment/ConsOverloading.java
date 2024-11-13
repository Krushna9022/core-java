/*Write a java program to create program for constructor overloading with class name as
ArrayCons
ArrayCons (int a []): this function is used for accept array as parameter
and
ArrayCons(int a[] , int b[]): this function will accept array as parameter
and check array is anagram or not.
*/

class ArrayCons{
	ArrayCons(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	ArrayCons(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			
		}
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("array are anagram");
		}
		else
		{
			System.out.println("arrays are  not  anagram");
		}
	}
}

public class ConsOverloading
{
	public static void main(String x[])
	{
		// ArrayCons cons1=new ArrayCons(new int[]{10,20,30,40});
		ArrayCons cons=new ArrayCons(new int[]{10,20,30,40},new int[]{10,20,30,40});
	}
}