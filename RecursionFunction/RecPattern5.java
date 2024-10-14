public class RecPattern5
{
	public static void main(String x[])
	{
		pattern(1,5);
	}
	public static void pattern(int x,int y)
	{
		if(x==5)
		{
			return;
		}
		
		printSpace(y-1);
		
		for(int i=1;i<=2*x-1;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		pattern(x+1,y-1);
		
		
	}
	
	public static void printSpace(int space)
	{
		if(space==0)
		{
			return;
		}
		System.out.print(" ");
		printSpace(space-1);
	}
	
	
}