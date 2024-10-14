public class P15CelingAndFloor
{
	public static void main(String x[])
	{
		int a[]=new int[]{2,3,4,7,8,9,9,10};
		int x1=5;
		celing(a,x1);
	}
	public static void celing(int a[],int x)
	{
		if(x>a[a.length-1])
		{
			System.out.println(" not present");
			return;
		}
		if(x<a[0])
		{
			System.out.println(a[0]);
			return;
		}
		for(int i=0;i<a.length;i++)
		{
			// if(x==a[i])
			// {
				// System.out.println("celing is "+a[i]);
				// return;
			// }
			if(x>a[i] &&x<=a[i+1])
			{
				System.out.println("celing is "+a[i+1]);
				return;
			}
		}
	}
}