public class ProductOfdigit
{
	public static void main(String x[])
	{
		ProductOfdigit c=new ProductOfdigit();
		c.productDigit(1234,1);
		c.sumDigit(456,0);
	}
	
	void productDigit(int n,int p)
	{
		if(n==0)
		{
			System.out.println(p);
			return ;
		}
		int rem=n%10;
		p*=rem;
		productDigit(n/10,p);
	}
 
	void  sumDigit(int n,int sum) 
	{
		if(n==0)
		{
			System.out.println(sum);
			return;
		}
		int rem=n%10;
		sum+=rem;
		sumDigit(n/10,sum);
	}
}