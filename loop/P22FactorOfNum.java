import java.util.Scanner;
public class P22FactorOfNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
		  if(a%i==0)
		  {
			System.out.print(i+" ");
		  }
		}
	}
}
