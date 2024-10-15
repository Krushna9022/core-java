public class SortP1Poly
{
	public static void main(String x[])
	{
		int a[]={1,3,2,6,9,7};
		char c[]={'a','b','c','d'};
		sort(a);
		System.out.println();
		sort(c);
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
		
		System.out.println("print int array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" " );
		}
	}
	
	public static void sort(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}

