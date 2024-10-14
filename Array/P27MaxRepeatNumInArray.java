import java.util.*;
public class P27MaxRepeatNumInArray
{
	public static void main(String x[])
	{
		int a[]=new int[]{2,3,3,5,3,4,1,7,7,7,7};
		Arrays.sort(a);
		int index=-1;
		int count=1;
		int maxcount=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				break;
			}
			if(a[i]==a[i+1])
			{
				count++;
				if(count>maxcount)
				{
					maxcount=count;
					index=i;
				}
			}
			else
			{
				
				count=1;
			}
			
		}
		System.out.println("max Repating element is "+a[index]);
	}
}