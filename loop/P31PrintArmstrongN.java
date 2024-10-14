import java.util.Scanner;
class P31PrintArmstrongN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			int temp=i,count=0;
			while(temp!=0)
			{
				temp=temp/10;
				count++;
			}
			temp=i;
			int sum=0;
			while(temp!=0)
			{
				int rem=temp%10;
				temp=temp/10;
				sum+=Math.pow(rem,count);
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
} 