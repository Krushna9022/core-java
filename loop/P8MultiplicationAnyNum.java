import java.util.Scanner;
public class P8MultiplicationAnyNum
{
	public static void main(String x[])
	{   Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(a+" x "+i+" = "+(a*i));
			i++;
		}
	}
}