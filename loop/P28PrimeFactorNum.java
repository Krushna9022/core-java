import java.util.*;
class P29PrimeFactorNum
{
	public static void main(String x[])
	{
		int i,j,f=1,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{	
				boolean flag=true;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					System.out.println(i);
				}
			}
		}
	}
}