public class P11SecondLargest
{
	public static void main(String x[])
	{
		int a[]=new int []{10,20,40,60,70,40,90,80};
		secondLarg(a);
	}
	
	public static void secondLarg(int a[])
	{
		int max=a[0];
		int sec=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				int temp=max;
				max=a[i];
				sec=temp;
			}
			else if(a[i]>sec&& a[i]!=max)
			{
				sec=a[i];
			}
		}
		System.out.println(max+ " max");
		System.out.println(sec+" sec max");
		
	}
	
}