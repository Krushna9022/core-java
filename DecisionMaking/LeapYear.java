import java.util.Scanner;
public class LeapYear
{
	public static void main(String x[])
	{       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr the year");
		int year=sc.nextInt();
		if( ( (year%4==0) && (year%100!=0) ) || (year%400==0))
		{
			System.out.println("Year  is leap");
		}
		else
		{
			System.out.println("Year is not leap");
		}
	}
}