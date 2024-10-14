import java.util.*;
public class P2MaxAndMin
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(max +" is max");
		System.out.println(min +" is min");
	}
}