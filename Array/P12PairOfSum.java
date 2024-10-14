public class P12PairOfSum
{
	public static void main(String x[])
	{
		int a[]={6,8,4,-5,7,9};
		bruteForcePairSum(a,15);
		
		optimalApproach(a,15);
	}
	
	public static void bruteForcePairSum(int a[],int target)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+"  "+a[j]);
				}
			}
		}
	}
	
	public static void optimalApproach(int a[],int target)
	{
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int pair=a[i]+a[j];
			if(pair>target)
			{
				j--;
			}
			else if(pair<target)
			{
				i++;
			}
			else 
			{
				System.out.println(a[i]+" "+a[j]);
				//j--;
				break;
			}
		}
	}
	
	
}