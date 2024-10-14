import java.util.Scanner;
public class GroupchaAdmission
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int remaining ;
		System.out.println("enetr the total member of grup");
		int group=sc.nextInt();
		System.out.println("Enter the total seats of Course");
		int totalseats=sc.nextInt();
		System.out.println("Enter the number of already Enrolled  ");
		int enrolled=sc.nextInt();
		int a=group+enrolled;
		if(a<=totalseats)
		{
			remaining =totalseats-enrolled;
			System.out.println("yes can register "+ remaining+"seats remaining");
		}
		else
		{
			remaining =totalseats-enrolled;
			System.out.println("no cant register Only  "+remaining+
			" seats remain And you want "+group+" seats");
		}
		
	}
}
