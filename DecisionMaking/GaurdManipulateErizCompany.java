import java.util.*;
public class GaurdManipulateErizCompany
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number gaurd that can manipulate by Eriz Comapany ");
		int erizgaurd=sc.nextInt();
		System.out.println("Enter the number that are available ");
		int  avblegaurd=sc.nextInt();
		if(erizgaurd>=avblegaurd)
		{
			System.out.println("yes manipulate ");
		}
		else 
		{
			System.out.println("no manipulate");
		}
		
	}
}