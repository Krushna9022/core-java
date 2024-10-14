public class P9EvenOddSort
{
	public static void main(String x[])
	{
		int a[]=new int[]{1,2,3,3,4,5,6,7,8,9};
		sortEvenOdd(a);
	}
	public static void sortEvenOdd(int a[])
	{
		int odd[]=new int[a.length];
		int even[]=new int [a.length];
		int j=0,k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[j++]=a[i];
			}
			else
			{
				odd[k++]=a[i];
			}
		}
		
		System.out.print("\n printing odd array\n" );
		for(int i=0;i<k;i++)
		{
			System.out.print(odd[i]+"\t");
		}
		
		System.out.print("\n printing even array\n");
		for(int i=0;i<j;i++)
		{
			System.out.print(even[i]+"\t");
		}
	}
}