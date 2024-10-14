import java.util.*;
class P11FirstAndLastDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int lastdigit=no%10;
		while(no>10)
		{
			no=no/10;
		}
		System.out.println("fist digit "+no+" Last digit "+lastdigit);
	}
}