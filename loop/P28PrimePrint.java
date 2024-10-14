import java.util.*;
class P28PrimePrint
{
	public static void main(String x[])
	{
		int i,j,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<=num;i++)
		{
			int count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{count++;
				}
			}
			if(count==2)
			{
			System.out.print(i +" " );
			}
		}
	}
}