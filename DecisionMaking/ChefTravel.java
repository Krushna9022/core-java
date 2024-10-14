import java.util.Scanner;
public class ChefTravel
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fair of cab of fist cab");
		int cab1=sc.nextInt();
		System.out.println("Enter the fair of cab of second cab");
		int cab2=sc.nextInt();
		if(cab1>cab2)
		{
			System.out.println("Travel cab 2");
		}
		else if(cab1<cab2)
		{
			System.out.println("Travel by cab1");
		}
		else
		{
			System.out.println("travel by any");
		}
	}
}
