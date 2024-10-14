import java.util.Scanner;
public class P25LCMOfNum
{
	public static void main(  String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two   the Number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int hcf=1;
		for(int i=1;i<n1 && i<n2;i++)
		{
		    if(n1%i==0 &&n2%i==0)
			{
				hcf=i;
			}
		}
		int lcm=(n1*n2)/hcf;
		System.out.println("lcm of "+n1 +" & "+n2 +" is "+lcm );
	}
}