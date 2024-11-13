public class AccessModifier
{
	public static void main(String x[])
	{
		B b=new B();
		b.show();
	}
}

class A
{
	protected void show()
	{
		
		System.out.println("method in A class");
	}
}
class B extends A
{
	void show()
	{
		super.show();
		System.out.println("method in B class");
	}
}