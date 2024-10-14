import java.util.Scanner;
public class P30CheckArmstrong
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int temp=a,count=0;
		while(temp>0)
		{
		  temp=temp/10;
		  count++;
		}
		temp=a;        //reassign a to temp
		int sum=0;
		while(temp!=0)
		{	
			int power=1;
			int rem=temp%10;
			for(int i=1;i<=count;i++)
			{
				power*=rem;
			}
			sum+=power;
			//System.out.println(power);
			//System.out.println(sum);
			temp=temp/10;
		}
		if (sum==a)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}
}