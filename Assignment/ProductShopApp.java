/*Write a Java program to create a class called Product with private instance variables
productName, productCode, and price. Provide public getter and setter methods to access and
modify these variables. Add a method called applyDiscount() that takes a percentage and
reduces the price by that percentage*/
import java.util.*;
class Product
{
	private String productName;
	private int productCode;
	private float price;
	
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductCode(int productCode)
	{
		this.productCode=productCode;
	}
	
	public int getProductCode()
	{
		 return productCode;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
}

class ProductManager
{
	Product p[];
	ProductManager(Product p[])
	{
		this.p=p;
	}
	
	public void applyDiscount(float per)
	{
		for(int i=0;i<p.length;i++)
		{
			float dis=p[i].getPrice()*(per/100);
			float price=p[i].getPrice()-dis;
			p[i].setPrice(price);
		}
	}
	
	public void showDetail()
	{
			System.out.println("--------------Product Detil
			-------------");
		for(int i=0;i<p.length;i++){
			System.out.println("-----------------------------------");
			System.out.println(p[i].getProductName()+"\t"+ p[i].getProductCode()+"\t"+p[i].getPrice());
		}
	}
}

public class ProductShopApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[2];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product();
			System.out.println("enter the product-name");
			String pname=sc.nextLine();
			System.out.println("enter the product-code");
			int code=sc.nextInt();
			System.out.println("Enter the product-Price");
			float price=sc.nextFloat();
			p[i].setProductName(pname);
			p[i].setProductCode(code);
			p[i].setPrice(price);
			sc.nextLine();
		}
		ProductManager pm=new ProductManager(p);
		pm.showDetail();
		
		pm.applyDiscount(10.0f);
		pm.showDetail();
	}
}