class Value
{ int a,b;
	public void setValue(int x,int y)
	{	this.a=x;
		this.b=y;
	}
}
class Add extends Value
{
	public int addValue()
	{
		return a+b;
	}
}
class Subtract extends Value
{
	public int subtractValue()
	{
		return a-b;
	}
}
class Multiply extends Value
{
	public int multiplyValue()
	{
		return a*b;
	}
}
public class CalciApp
{
	public static void main(String x[])
	{
		int a=10;
		int b=5;
		
		Add add=new Add();
		add.setValue(a,b);
		System.out.println("Addition is "+add.addValue());
		
		Subtract sub=new Subtract();
		sub.setValue(a,b);
		System.out.println("Subtraction is "+sub.subtractValue());
		
		Multiply mul=new Multiply();
		mul.setValue(a,b);
		System.out.println("Multiplication is "+mul.multiplyValue());
	}
}