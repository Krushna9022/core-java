import java.util.*;
class Circle
{
	float r;
	public void setRadius(float r)
	{
		this.r=r;
	}
	public void showArea()
	{
		float area=3.14f*r*r;
		System.out.printf(" Area is %.2f", area);
	}
}


public class CircleAreaApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		Circle c=new Circle();
		c.setRadius(r);
		c.showArea();
	}
}