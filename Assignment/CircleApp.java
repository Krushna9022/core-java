/*
Write a Java program to create a class called Circle with a private instance variable radius. Provide
public getter and setter methods to access and modify the radius variable. However, provide two
methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter
based on the current radius value.
*/

class Circle
{
	private float radius;
	public void setRadius( float radius)
	{
		this.radius=radius;
	}
	public float getRadius()
	{
		return radius;
	}
	
}

class AreaCalci
{
	private Circle c;
	public void setValue(Circle c)
	{
		this.c=c;
	}
	public void calculateArea()
	{
		System.out.println("Area of Circle "+ (3.14f* c.getRadius()*c.getRadius()));
	}
	
	public void calculatePerimeter()
	{
		System.out.println("circumference of circle "+(2*3.14f*c.getRadius()));
	}
}

public class CircleApp
{
	public static void main(String x[])
	{
		Circle c=new Circle();
		c.setRadius(4.0f);
		c.getRadius();
		AreaCalci area=new AreaCalci();
		area.setValue(c);
		area.calculateArea();
		area.calculatePerimeter();
	}
}