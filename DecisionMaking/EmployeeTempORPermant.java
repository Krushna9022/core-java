
import java.util.*;
public class EmployeeTempORPermant
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the id 1-100");
		int id=sc.nextInt();
		if(id>0 &&id<=10)
		{
			System.out.println("Enter the salry");
			int salary=sc.nextInt();
			
			if(salary>=10000)
			{
				System.out.println("Employee is permanant");
			}
			else
			{
				System.out.println("Employee is temparary");
			}
		 }
		 else
		 {
			System.out.println("can't Employee ");
		 }
	 
	}
}