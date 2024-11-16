abstract class Pattern
{
	abstract void display();
} 
class FirstPattern  extends Pattern
{
	void display()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2!=0)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
	}
}

class SecondPattern  extends Pattern
{
	void display()
	{
		for(int i=1;i<=5;i++)
		{	char a='a';
			char b='A';
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(b++);
				}
				else
				{
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}
}

public class PatternPrint
{
	public static void main(String x[])
	{
		FirstPattern first =new FirstPattern();
		first.display();
		
		System.out.println("\n");
		SecondPattern second=new SecondPattern();
		second.display();
		
	}
}
