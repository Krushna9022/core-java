public class P24InvensionOfArray
{
	public static void main(String x[])
	{
		int a[]={1,9,6,4,5};
		invension(a);
	}
	
	public static void invension( int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					System.out.print(" ("+a[i]+","+a[j]+") ");
					count++;
				}
			}
		}
		System.out.println("\nNumber of invension can form from array is "+count);
	}
}