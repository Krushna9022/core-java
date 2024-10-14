public class PrintFirstLast
{
	public static void main(String x[])
	{  int num=1234;
		int l=num%10;
		firstlast(num,l);
		System.out.println(sumFirstLast(num,1234%10));
	}
	
	public static int   firstlast(int n ,int last )
	{
		
		if(n>10)
		{
		   return firstlast(n/10,last);
		}
		System.out.println(n+" "+last);
		return 0;
	}
	
	
	public static int sumFirstLast(int first,int last)
	{
		if(first >10)
		{
			return sumFirstLast(first/10,last);
		}
		
		return first+last;
	}
} 