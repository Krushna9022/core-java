public class va
{
	public static void main(String x[])
	{
		int sort[]=new int []{1,2,2,3,4,6,6,6,9,9,10};
		sortArray(sort);
	}
	
	public static void sortArray(int a[])
	{ 
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				System.out.println(a[i]+"-------"+count);
				return;
			}
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i]+"-------"+count);
				count=1;
			}
		}
	}
}