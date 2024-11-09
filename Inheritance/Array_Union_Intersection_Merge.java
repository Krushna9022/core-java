class TestArr
{
	int a[];
	int b[];
	void acceptArr(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
}
class MergeArray extends TestArr
{
	void mergeArr()
	{
		int j=0;
		int merge[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			merge[j++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			merge[j++]=b[i];
		}
		System.out.println("printing the merge arrays");
		for(int i=0;i<j;i++)
		{
			System.out.print(merge[i]+" ");
		}
	}
}

class Intersection extends TestArr {
	void findIntersection()
	{
		System.out.println("\nprinting the Intersect element :-");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
class Union extends TestArr
{
	void findUnion()
	{
		System.out.println("\nprinting union of array");
		for(int i=0;i<a.length;i++)
		{	boolean flag=true;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.print(a[i]+ " ");
			}
		}
		
		for(int i=0;i<b.length;i++)
		{	
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					System.out.print(b[i]+ " ");
				}
			}
			
		}
		
		for(int i=0;i<b.length;i++)
		{	boolean flag=true;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.print(b[i]+ " ");
			}
		}
		
		
	}
}

public class Array_Union_Intersection_Merge
{
	public static void main(String x[])
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{40,50,60,70,80};
		MergeArray m=new MergeArray();
		m.acceptArr(a,b);
		m.mergeArr();
		
		Intersection intersection=new Intersection();
		intersection.acceptArr(a,b);
		intersection.findIntersection();
		
		Union union = new Union();
		union.acceptArr(a,b);
		union.findUnion();
	}
}