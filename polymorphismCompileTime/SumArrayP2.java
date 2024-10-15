public class SumArrayP2
{
	public static void main(String x[])
	{
	   int a[]={1,2,3,4,5};
	   char ch[]={'a','1','2','c','3','r'};
	   sum(a);
	   sum(ch);
	}
	
	public static void sum(int a[])
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s+=a[i];
		}
		
		System.out.println(s);
	}
	
	public static void sum(char ch[])
	{
		int s=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				s+=(int)ch[i]-48;
			}
		}
		System.out.println(s);
	}
}