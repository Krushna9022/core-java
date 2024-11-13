/*
Write program to create class name as occurrence with two functions
void setArray(int a[]): this function can accept array as parameter
void getoccurrence (): this function show occurrence of every element form array
*/
import java.util.*;
public class OccuranceApp
{
	public static void main(String x[])
	{
		Occurance occ=new Occurance();
		occ.setArray(new int[]{1,2,3,2,3,3,4,1,4,5,6,7,5,4});
		occ.getoccurrence();
	}
}

class Occurance
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public void getoccurrence()
	{
		System.out.println("Elements of array are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			
			
			if(a[i]==a[a.length-1])
			{
				System.out.println(a[i]+" ------ "+count);
				break;
			}
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i]+" ------ "+count);
				count=1;
			}
			
		}
	}
}