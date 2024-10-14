public class P25MaxDiff2Elements
{
	public static void main(String x[])
	{
		int a[]={7,9,5,6,13,2};
		int maxdiff=a[1]-a[0];
		int e1=a[0],e2=a[2];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{	int diff=a[j]-a[i];
				if(a[j]>a[i])
				{
					if(diff>maxdiff)
					{
						maxdiff=diff;
						e1=a[i];
						e2=a[j];
						
					}
				}
				
			}
		}
		
		System.out.println("element  "+e1+" element "+e2 +"\n max differnce is"+ maxdiff);
	}
}