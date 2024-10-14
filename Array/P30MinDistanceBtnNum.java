import java.util.*;
public class P30MinDistanceBtnNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int []{7,9,5,11,7,4,12,6,2,11};
		System.out.println("Enter the first element ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second element");
		int num2=sc.nextInt();
		int min= minDistance(new int[]{1,3,4,5,6},num1,num2);
		System.out.println(min);
		
	}
	
	public static int minDistance(int a[],int n1,int n2)
	{
		int d=0;
		int min=a.length+1;
		int pos1=Integer.MAX_VALUE,pos2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n1)
			{
				pos1=i;	
			}
			else if(a[i]==n2)
			{
				pos2=i;
			}
			
			if(pos1<a.length && pos2 < a.length)
			{
				 d=Math.abs(pos2-pos1);
				if(min>d)
				{
					min=d;
				}
				
			}
		}
		
		d=min>a.length?-1:min;
		return d;
		
	}
}