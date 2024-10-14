public class P3SortAscending
{
	public static void main(String x[])
	
	{
		int a[]={1,5,8,9,4};
		sort(a);
	}
	
	public static void sort(int a[])
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
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" " );
		}
	}
}