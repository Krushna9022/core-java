import java.util.Scanner;
public class P4InsertElement
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index ");
		int index=sc.nextInt();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		System.out.println("Before inserting value");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+"\t ");
		}
		insertElement(a,index,value);
		
	}
	
	public static void insertElement(int a[],int idx,int value)
	{
		if(idx>=a.length)
		{
			System.out.println("lenth of array is so not possible"+idx);
			return;
		}
		
		for(int i=a.length-2;i>=idx;i--)
		{
			a[i+1]=a[i];
		}
		a[idx]=value;
		//System.out.println();
		System.out.println("\nAfter inserting value");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
	}
}