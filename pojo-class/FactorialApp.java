public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int num=sc.nextInt();
		Factorial f=new Factorial();
		f.setValue(num);
		f.getValue();
	}
}

class Factorial 
{
	int x;
	public void setValue(int x)
	{
		this.x=x;
	}
	public void getValue()
	{
		fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
}