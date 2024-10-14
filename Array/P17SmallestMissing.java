public class P17SmallestMissing
{
	public static void main(String x[])
	{
		int a[]={0,1,2,3,4,5,6,7,8,9};
		smallEle(a);
	}
	
	/*public static void smallEle(int a[])
	{
		search:
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(j);
				break search;
				
			}
		}
	}*/
	
	public static void smallEle(int a[])
	{
		boolean flag=false;
		for(int i=0;i<a.length-1;i++)
		{
				if(a[i+1]-a[i]==1)
				{
					continue;
				}
				else
				{
					System.out.println(a[i]+1);
					flag=true;
					break;
				}
		}
		if(flag)
		{}
		else
		{
			System.out.println("Not found");
		}
		
	}
}