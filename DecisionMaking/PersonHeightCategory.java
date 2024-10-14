//java program to person height categorise
import java.util.Scanner;
public class PersonHeightCategory
{
	public static void main(String x[])5
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height in centimeter");
		int height=sc.nextInt();
		if(height<150)
		{
			System.out.println("person is draft");
		}
		else if(height>=150 &&height<=165)
		{
			System.out.println("person is Average height");
		}
		else
		{
				System.out.println("person is taller");
		}
	}
}