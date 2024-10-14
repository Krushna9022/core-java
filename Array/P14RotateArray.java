import java.util.Scanner;
public class P14RotateArray
{
	public static void main(String x[])
	{
		int a[]={10,20,30,40,50,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rotation");
		int r=sc.nextInt();
		r=r%a.length;
		//method 1  one by rotate the elements
		rotateOneByOne(a,r);
		
		//method 2 store in temp array[];
		rotateByTemp(a,r);
	}
	
	public static void rotateOneByOne(int a[],int r)
	{
		for(int i=0;i<r;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println("\nprinting rotated array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	
	public static void rotateByTemp(int a[],int r)
	{
		int temp[]=new int[a.length];
		int k=0;
		for(int i=r;i<a.length;i++)
		{
			temp[k++]=a[i];
		}
		for(int i=0;i<r;i++)
		{
			temp[k++]=a[i];
		}
		
		System.out.println("\nprinting rotated array");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+"\t");
		}
	}
}