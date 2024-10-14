import java.util.Scanner;
public class CREDProgram
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the credit score ");
		int credit=sc.nextInt();
		if(credit>=750)
		{
			System.out.println("Access the CRED progrm");
		}
		else
		{
			System.out.println("Can't Access the CRED program");
		}
	}
}