import java.util.Scanner;
public class P34checkStrongNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n,i,rem ,sum=0;
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{  int fact=1;
			rem=n%10;
			for(i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.print(fact+" ");
			sum=sum+fact;
			//System.out.print(sum+" ");
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		
		}
		else
		{
			System.out.println("Not Strong number");
		}
	}
}