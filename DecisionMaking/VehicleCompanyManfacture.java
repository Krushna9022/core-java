import java.util.Scanner;
public class VehicleCompanyManfacture
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of vehicle to be manifactue");
		int v=sc.nextInt();
		System.out.println("Enter the no of wheels to be used for manifactue");
		int w=sc.nextInt();
		if(2<=w && v<w && w%2==0)
		{
			int fv=(4*v-w)/2;
			System.out.println("This is a number of two wheels "+fv +" four wheelers is "+(v-fv));
		}
		else 
		{
			System.out.println("input wrong ");
		}
		
	}
	
}