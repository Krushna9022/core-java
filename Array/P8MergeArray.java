public class P8MergeArray
{
	public static void main(String x[])
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[]{60,70,80,90,100};
		mergeArray(a,b);
	}
	public static void mergeArray(int a[],int []b)
	{
		int j=0;
		int temp[]=new int[a.length+b.length];
		System.out.println("\nprint first Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
			temp[j++]=a[i];
		}
		System.out.println("\nprint second Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"\t");
			temp[j++]=b[i];
		}
		
		System.out.println("\nPrinting Merge Array");
		for(int i=0;i<j;i++)
		{
			System.out.print(temp[i]+"\t");
		}
	}
}