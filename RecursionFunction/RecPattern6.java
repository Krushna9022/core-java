public class RecPattern6
{
	public static void main(String x[])
	{
		pattern(1,5);
	}
	
	public static void pattern(int x,int y)
	{
		if(x==6)
		{return;}
		printSpace(x);
		
		for(int i=1;i<=2*y-1;i++)
		{
			System.out.print(i);
		}
		
		System.out.println();
		pattern(x+1,y-1);
	}
	
	public static void printSpace(int x)
	{
		if(x==0)
			return;
		System.out.print(" ");
		printSpace(x-1);
	}
}