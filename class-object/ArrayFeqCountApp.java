/*
WAP to create the class name as ArrayFeqCount with a following methods
class ArrayFeqCount
*/
import java.util.*;
class ArrayFeqCount
{
	int a[];
	boolean b[];
	public void setIntArray(int a[])
	{
		this.a=a;
	}
	   
	public void countFeqCount()
	{
		b=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
		if(!b[i])
		{
			System.out.println(a[i]+" ------ "+count);
		}			
		}
	}
}

public class ArrayFeqCountApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Elements");
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayFeqCount fc=new ArrayFeqCount();
		fc.setIntArray(a);
		//fc.setIntArray(new int[]{10,20,20,30,40});
		fc.countFeqCount();
	}
	
}