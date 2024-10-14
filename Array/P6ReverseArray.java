public class P6ReverseArray
{
	public static void main(String x[])
	{
		int a[]=new int[]{10,20,30,40,50};
		System.out.println("\nArray Before reverse");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		int []res=reverseArray(a);
		System.out.println(" \nArray After  reverse");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+"\t");
		}
	}
	
	public static int [] reverseArray(int r[])
	{
		int mid=r.length/2;
		int end=r.length-1;
		
		for(int i=0;i< mid ;i++)
		{
			int temp=r[i];
			r[i]=r[end];
			r[end]=temp;
			end--;
		}
		
		return r;
	}
}