public class P18GreaterElement
{
	public static void main(String x[])
	{
		int a[]={5,3,10,19,6,13};
		getGreater(a);
	}
	
	public static void getGreater(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					System.out.println("next bigger for"+a[i]+ "  is "+a[j]);
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("next bigger for"+a[i]+ "  is "+ -1);	
			}
		}
	}
}