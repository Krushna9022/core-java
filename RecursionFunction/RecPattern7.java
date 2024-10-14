import java.util.Scanner;
class RecPattern7
{	
	public static void main(String x[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int y=sc.nextInt();
		
		pattern(y,y);
		pattern2(1,y);
	}
	
	public static void pattern(int x,int y){
		if(x==0)
		return;
		
		printSpace(x-1);
		// for(int i=1;i<=y-x;i++)
		// {
			// System.out.print(i+" ");
		// }
		printStar(y-x);
		System.out.println();
		pattern(x-1,y);
		
	}
	
	public static void printSpace(int x)
	{
		if(x==0){
		return;
		}
		System.out.print(" ");
		printSpace(x-1);
	}
	public static void printStar(int x)
	{
		if(x==0)
		{
			return;
		}
		
		System.out.print(" *");
		printStar(x-1);
	}
	
	//rev pattern;
	public static void pattern2(int x,int y)
	{
		if(x==y)
		{
			return;
		}
	 printSpace1(x-1);
	 printStar1(y-x);
	 System.out.println();
	 pattern2(x+1,y);
	}
	public static void printSpace1(int x)
	{
		if(x==0)
		{
			return;
		}
		System.out.print(" ");
		printSpace1(x-1);
	
	}
	public static void printStar1(int x)
	{
		if(x==0)
			return;
		System.out.print(" *");
		printStar1(x-1);
	}
	
}