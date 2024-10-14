import java.util.Scanner;
public class P10DeleteElement
{
	public static void main(String x[])
	{
		int a[]=new int []{10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.printf("enter the position");
		int idx=sc.nextInt();
		deleteElement(a,idx);
		
	}
	
	public static void deleteElement(int a[],int idx)
	{
		if(idx>a.length-1)
		{
			System.out.println("invlid  index");
			return;
		}
		
		for(int i=idx;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			a[i+1]=0;
			
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			
			System.out.print(a[i]+"\t");
		}
	}
}