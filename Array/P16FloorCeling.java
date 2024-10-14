import java.util.*;
public class P16FloorCeling
{
	public static void main(String x[])
	{
		int a[]={2,3,5,7,8,9};
		
		for(int i=0;i<=10;i++)
		{
			System.out.println();
			celing(a,i);
			floor(a,i);
			System.out.println();
		}
		
	}
	
	public static void celing(int a[],int x)
	{
		if(x>a[a.length-1])
		{
			System.out.println("for "+x+" celing is "+-1);
			return;
		}
		if(x<a[0])
		{
			System.out.println("for "+x+" celing is "+a[0]);
			return;
		}
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				System.out.println("for "+x+"celing is "+a[i]);
				return;
			}
			if(x>a[i] &&x<=a[i+1])
			{
				System.out.println("for "+x+"celing is "+a[i+1]);
				return;
			}
		}
	}
	
	public static void floor(int a[],int x)
	{
		if(x<a[0])
		{
			System.out.print("for "+x+" floor is:"+-1);
			return;
		}
		if(x>a[a.length-1])
		{
			System.out.print("for "+x+" floor is:"+a[a.length-1]);
			return;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(x==a[i])
			{
				System.out.print("for "+x+" floor is "+a[i]);
				return;
			}
			if(x<a[i] && x>=a[i-1] )
			{
				System.out.print("for "+x+" floor is "+a[i-1]);
				return;
			}
		}
		
	}
}	