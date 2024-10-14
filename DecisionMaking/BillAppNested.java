//if else nested program
import java.util.Scanner;
public class BillAppNested
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the quntaty of product");
		double qty=sc.nextDouble();
		if(qty>10)
		{   System.out.println("Enter the rate of the product");
			double rate=sc.nextDouble();
			double total=qty*rate;
			if(total>=10000)
			{
				double dis=total*(20/100);
				total=total-dis;
				System.out.println("bill is  "+total);
			}
			else
			{
				double dis=total*(10/100);
				 total=total-dis;
				System.out.println("bill is  "+total);
			}
		}
		else
		{
			System.out.println("Not allow for this much quntaty");
		}
	}
}