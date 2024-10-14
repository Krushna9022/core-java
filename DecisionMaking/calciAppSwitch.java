//program to add, multiply.app
import java.util.Scanner;
public class  calciAppSwitch
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a and b to do operation on it");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c;
	System.out.println("1.Add");
	System.out.println("2.subtract");
	System.out.println("3.multiplication");
	System.out.println("4.division");
	System.out.println("5.modulus");
    System.out.println("enter choice");
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:
		c=a+b;
		System.out.println("a+b"+c);
		break;
		case 2:
		c=a-b;
		System.out.println("a-b"+c);
		break;
		case 3:
		c=a*b;
		System.out.println("a*b"+c);
		break;
		case 4:
		c=a/b;
		System.out.println("a/b"+c);
		break;
		case 5:
		c=a%b;
		System.out.println("a%b"+c);
		break;
		default:
		System.out.println("wromg input or choice");
		
	}
	
	
  }
}