/*
Write a Java program to create a class called House with private instance variables address,
numberOfRooms, and area. Provide public getter and setter methods to access and modify
these variables. Add a method called calculatePrice() that returns the price of the house based
on its area and a price per square meter.
*/
class House
{
	private String address;
	private float area;
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setArea(float area)
	{
		this.area=area;
	}
	public float getArea()
	{
		return area;
	}
}

class AreaCalci
{
	House h;
	float areaprice;
	AreaCalci(House h)
	{
		this.h=h;
	}
	
	public void calculatePrice(float price)
	{
		 areaprice=h.getArea()*price;
		
	}
	
	public void getDetail()
	{
		System.out.println(h.getAddress()+"\t"+h.getArea()+"\t"+areaprice);
	}
}

public class HousePrice
{
	public static void main(String x[])
	{
		House h=new House();
		h.setAddress("beed-gevrai");
		h.setArea(1000);
		
		AreaCalci p=new AreaCalci(h);
		p.getDetail();
		p.calculatePrice(10);
		p.getDetail();
	}
}