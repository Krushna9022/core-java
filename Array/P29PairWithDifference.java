public class P29PairWithDifference
{
	public static void main(String x[])
	{
		int a[]={1,15,39,75,92};
		pairWithDiff(a);
		
	}
	public static void pairWithDiff(int a[])
	{
		boolean  flag=true;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]==53)
				{
					System.out.println(a[i]+" "+ a[j]);
					flag=false;
					return;
				}
			}
		}
		if(flag)
		{
			System.out.println( "Not found");
		}
		return;
	}
	
}
