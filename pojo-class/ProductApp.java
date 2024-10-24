/*
		variable argumnent
WAP to create the class name as Product with a following properties 
class Product

Create the another class name as CalculateBill and this class is depend on product but we want to pass more than one product details to CalculateBill class so here we use the var-args concept.*/

class Product{
	private int id;
	private String name;
	private int rate;
	private int qty;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setRate(int rate)
	{
		this.rate=rate;
	}
	public int getRate()
	{
		return rate;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}	
}

class CalculateBill
{
	private Product prod[];
	public void setProduct(Product ...prod)
	{
		this.prod=prod;
	}
	public void calBill()
	{
		int total=0;
			System.out.println("Id"+" \t"+"Name"+"\t "+ "Rate"+"\t" +"qty"+"\t"+"total");
		for(int i=0;i<prod.length;i++)
		{
			System.out.println(prod[i].getId()+"\t"+prod[i].getName()+"\t"+prod[i].getQty()+"\t"+prod[i].getRate()+"\t"+prod[i].getRate()*prod[i].getQty());
			total+=prod[i].getRate()*prod[i].getQty();
		}
		System.out.println("================================\n \t\t total :"+total);
	}
} 

public class ProductApp
{
	public static void main(String x[])
	{
		Product p1=new Product();
		p1.setId(1);
		p1.setName("p2");
		p1.setRate(100);
		p1.setQty(3);
		
		Product p2=new Product();
		p2.setId(4);
		p2.setName("p1");
		p2.setRate(10);
		p2.setQty(9);
		
		Product p3=new Product();
		p3.setId(2);
		p3.setName("p3");
		p3.setRate(50);
		p3.setQty(4);
		
		CalculateBill b=new CalculateBill();
		b.setProduct(p1,p2,p3);
		b.calBill();
	}
}

