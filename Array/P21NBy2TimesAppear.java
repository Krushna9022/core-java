import java.util.*;
public class P21NBy2TimesAppear
{
	public static void main(String x[])
	{
		int a[]={1,3,3,5,4,3,2,3,3};
		int m=a[0];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(c==0)
			{
				m=a[i];
			}
			if(m==a[i])
			{
				c++;
			}
			else
			{
				c--;
			}
		}
		System.out.println(m);
		
		
	}
}