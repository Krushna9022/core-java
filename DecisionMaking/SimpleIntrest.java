import java.util.Scanner;
class SimpleIntrest
{
   public static void main(String []x)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principal amount");
	double p=sc.nextDouble();
	System.out.println("Entert the time in months");
	double time=sc.nextDouble();
	System.out.println("Enter the intrest rate");
	double rate=sc.nextDouble();
	double si=(p*time*rate)/100;
	System.out.println("Simple Intrest \t"+si);
	}
}