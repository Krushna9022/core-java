public class RecPattern4
{
	public static void main(String x[]) throws Exception
	{
		pattern(5,5);
	}
	public static void pattern(int x,int y) throws InterruptedException
	{
		if(x==0)
		{
			return ;
		}
		
		printSpace(x-1);
		printStar(y-x+1);
		System.out.println();
		pattern(x-1,y);
	}
	
	public static void printSpace(int space) throws InterruptedException
	{
		if(space==0)
		{
		return;
		}
		System.out.print("+");
		Thread.sleep(100);
		printSpace(space-1);
	}
	
	public static void printStar(int star)throws InterruptedException
	{
		if(star==0)
		{
			return;
		}
		System.out.print("*");
		Thread.sleep(100);
		printStar(star-1);
	}
}
