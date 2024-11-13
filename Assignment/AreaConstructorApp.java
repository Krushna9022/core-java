/*Create a class named 'Rectangle' with two data members- length and breadth and a
method to calculate the area which is 'length*breadth'. The class has three constructors
which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print
their areas*/

class Rectangle
{
	int length,breadth;
	Rectangle()
	{
		System.out.println("Area is  with zero pram "+(length*breadth));
	}
	Rectangle(int length,int breadth)
	{
		System.out.println("Area is with Two Param "+(length*breadth));
	}
	Rectangle(int l)
	{
		System.out.println("Area is with One Param "+(l*l));
	}
}
public class AreaConstructorApp
{
	public static void main(String x[])
	{
		Rectangle r0=new Rectangle();
		Rectangle r2=new Rectangle(2,4);
		Rectangle r1=new Rectangle(5);
	}
}