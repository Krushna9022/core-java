public class P23MovesAllZeroEnd
{
	public static void main(String x[])
	{
		int a[]={1,0,5,0,0,5,0,7};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}