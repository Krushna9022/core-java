import java.util.*;
public class JarwithCandadies
{
     public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int totalCandadies=10;
		int MinCandadies=5;
		System.out.println("Enter the candy to sold");
		int num=sc.nextInt();
		if(num>=1 && num<=5)
		{
			System.out.println("Candadies sold are"+num);
			System.out.println("Candadies remain are"+(totalCandadies-num));
		}
		else
		{
			System.out.println("Invalid input");
			System.out.println("Candadies remain are"+(totalCandadies));
		}
	}
}