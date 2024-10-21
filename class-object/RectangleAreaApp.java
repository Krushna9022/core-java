import java.util.*;
class Rectangle
{
	int length;
	int breadth;
	public void setLengthWidth(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int showArea()
	{
		int area=length*breadth;
		return area;
	}
}

public class RectangleAreaApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of rectangle ");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b=sc.nextInt();
		Rectangle r=new Rectangle();
		r.setLengthWidth(l,b);
		System.out.println("Area of rectangle is  "+r.showArea()+" unit");
	}
}