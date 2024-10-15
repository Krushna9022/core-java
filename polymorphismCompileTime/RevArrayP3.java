public class RevArrayP3
{
	public static void main(String x[])
	{
		int a[]=new int[]{1,2,3,4,5,6,7,8};
		char ch[]=new char[]{'a','b','c','d','e','f'};
		rev(a);
		System.out.println("\n");
		rev(ch);
	}
	public static void rev(char ch[])
	{
		int end=ch.length-1;
		int mid=ch.length/2;
		for(int i=0;i<mid;i++)
		{
			char temp=ch[i];
			ch[i]=ch[end];
			ch[end]=temp;
			end--;
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"  ");
		}
		
	}
	public static void rev(int a[])
	{
		int end=a.length-1;
		int mid=a.length/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}