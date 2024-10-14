import java.util.*;
public class P35StrongN_Num
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{   int temp=i,sum=0;
			while(temp!=0)
			{
			   int rem=temp%10,fact=1;
			   for(int j=1;j<=rem;j++)
			   {
					fact=fact*j;
			   }
			   sum+=fact;
			   temp=temp/10;
			}
			if(sum==i)
			{
			System.out.print(i+" ");
			}
		}
	}
}