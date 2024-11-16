abstract class Number
{	protected int no;
	void setNum(int no)
	{
		this.no=no;
	}
	abstract int getResult();
}
class ReverseNum extends Number
{
	int getResult()
	{int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		return rev;
	}
}

class CountDigit extends Number
{
	int getResult()
	{
		int count=0;
		while(no!=0)
		{
			count++;
			no=no/10;
		}
		return count;
	}
}

public class NumberOperation
{
	public static void main(String x[])
	{
		
		CountDigit count=new CountDigit();
		count.setNum(1234);
		int res=count.getResult();
		System.out.println("count of number is "+res+"\n");
		
		ReverseNum rev=new ReverseNum();
		rev.setNum(1234);
		 res=rev.getResult();
		System.out.println(" reverse number is "+res+"\n");
		
		
	}
}
