/*
Write program to create class name as FindMax with two functions
void setArray(int a[]): this function is used for accept array as parameter
int getMax(): this function can find the max value from array and return it.

*/
import java.util.*;
class FindMax
{
	int a[];
	public void setArray(int a [])
	{
		this.a=a;
	
	}
	
	public int getMax()
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}

public class FindMaxApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		int a[]=new int [5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("array is :-");
		for(int r:a)
		{
			System.out.println(r+" ");
		}
		FindMax find=new FindMax();
		find.setArray(a);
		int res=find.getMax();
		System.out.println("\n max is "+res);
		
	}
}