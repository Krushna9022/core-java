public class P20SumSubArrayWithSum
{
	public static void main(String x[])
	{
		int a[]={3,4,-7,1,3,3,1,-4};
		SumSubArray(a,7);
		kadane(a);
	}
	
	public static void SumSubArray(int a[],int target)
	{
		for(int i=0;i<a.length;i++)
		{	int sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==target)
				{	
					for(int k=i;k<=j;k++)
					{
						System.out.print(a[k]+" ");
					}
				System.out.println();
				}	
				
			}
		}
		
	}
	public static void kadane(int a[])
	{
		int curr=0;int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			curr+=a[i];
			max=Math.max(max,curr);
			if(curr<0)
			{
				curr=0;
			}
		}
		System.out.println(max);
	}
	
}