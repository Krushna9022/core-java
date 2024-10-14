public class SingleNumber
{
	public static void main(String x[])
	{ 	
		int a[]={1,3,5,6,5,1,3};
		int num=a[0];
		for(int i=1;i<a.length;i++)
		{
			num^=a[i];
		}
		System.out.println(num);
	}
}