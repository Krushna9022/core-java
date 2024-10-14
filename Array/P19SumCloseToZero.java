public class P19SumCloseToZero
{
	public static void main(String x[])
	{
		int a[]={38,44,63,-51,-35,19,84,-69,4,-46};
		sumCloseToZero(a);
	}
	
	public static void sumCloseToZero(int a[])
	{
		int sum=a[0]+a[1];
		int pair1=a[0];
		int pair2=a[1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j ++)
			{
				if(Math.abs(a[i]+a[j])<Math.abs(sum))
				{
					sum=a[i]+a[j];
					pair1=a[i];					
					pair2=a[j];					
				}
			}
		}
		System.out.println(pair1+"  "+pair2);
		
	}
}