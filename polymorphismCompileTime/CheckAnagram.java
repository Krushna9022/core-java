public class CheckAnagram
{
	public static void main(String x[])
	{	int a[]={1,2,3,4,5,6};
		int b[]={1,2,3,4,5,6};
		checkAnagram(a,b);
		char ch1[]=new char[]{'a','b','c','d','e','f'};
		char ch2[]=new char[]{'a','1','c','d','e','f'};
		checkAnagram(ch1,ch2);
	}
	public static void checkAnagram(int a[],int b[])
	{
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				flag=true;
			}
			else 
			{
			System.out.println(false);
			return;
			}
		}
		System.out.println(true);
		return ;
	}
	
	public static void checkAnagram(char c1[],char c2[])
	{
		boolean flag=true;
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]==c2[i])
			{
				flag=true;
			}
			else 
			{
			System.out.println(false);
			return;
			}
		}
		System.out.println(true);
		return ;
	}
	
}