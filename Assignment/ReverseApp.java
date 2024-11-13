/*
 Write program to create class name as Reverse with two functions
void setArray(int a[]): this function can accept array as parameter
int [] getSortArray(): this function can perform reverse on array and return sorted array
*/
import java.util.*;
public class ReverseApp
{
	public static void main(String x[])
	{	int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Reverse rev=new Reverse();
		rev.setArray(a);
		int res[]=rev.getSortArray();
		System.out.println("\n sorted of this array is :---");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
}

class Reverse
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public int [] getSortArray()
	{
		int end=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			if(i<end)
			{
				int temp=a[i];
				a[i]=a[end];
				a[end]=temp;
				end--;
			}
			
		}
		
		System.out.println("reverse array is :---");
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		Arrays.sort(a);
		return a;
	}
}
