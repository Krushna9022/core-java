import java.util.Scanner;
class DaysInMonths
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number check day in months");
	int days=sc.nextInt();
	switch(days)
	{
	case 1:
		System.out.println(31+"days in january");
		break;
 	case 2:
	System.out.println(28 +" or "+29+" days in february");
	break;
	case 3:
	System.out.println(31+" days in March");
	break;
	case 4:
	System.out.println(30+" days in April");
	break;
	case 5:
	System.out.println(31 +" days in May");
	break;
	case 6:
	System.out.println(30+" days in june");
	break;
	case 7:
	System.out.println(31+" days in july");
	break;
	case 8:
	System.out.println(31+" days in August");
	break;
	case 9:
	System.out.println(30 +" days in september");
	break;
	case 10:
	System.out.println(31+" days in Octomber");
	break;
	case 11:
	System.out.println(30+" days in November");
	break;
	case 12:
	System.out.println(31+" days in December");
	break;
	default:
	System.out.println("Invalid input");
	}

	}
}