import java.util.*;
public class LcmHcf 
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		hcf(a,b,1,1);
		
		lcm(a,b);
	}
	public static int  hcf(int a,int b,int i,int h)
	{  
		if(i<=a*b)
		{
			if(a%i==0 && b%i==0)
			{
				h=i;
			}
				return hcf(a,b,i+1,h);
		}
		System.out.printf(" %d",h);
		return h;
	}
	
	public static int  lcm(int a,int b)
	{  
		int l=(a*b)/hcf(a,b,1,1);
		System.out.println("lcm "+l);
		return l;
	}
}