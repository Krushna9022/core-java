import java.util.*;
 class Medical
{
	private int id,price,strip,qty;
	private String name,type;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setPrice(int price)
	{
	this.price=price;
	}
	public void  setQty(int qty)
	{this.qty=qty;}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public int getId()
	{
		return id;
	}
	public int getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return qty;
	}
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
		
}

 class MedicalDetail
 {
	 Medical m[];
	public void setDetail(Medical [] m)
	 {
		 this.m=m;
	 }
	 public void DisplayDetail()
	 {
		 for(int i=0;i<m.length;i++)
		 {System.out.println(m[i].getId()+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getQty()+m[i].getType());}
	 }
	 public void gstBill()
	 {
		 System.out.println("18%gst bill");
		 
		 for(int i=0;i<m.length;i++)
		 {
			 int bill=m[i].getPrice()*m[i].getQty();
			 double gst=bill+(bill*1.8);
			 System.out.println(m[i].getId()+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getQty()+m[i].getType()+"\t"+gst);
		}
	 }
	 
	 public void PriceMax()
	 {
		
		 
		 for(int i=0;i<m.length;i++)
		 {
			 if(m[i].getPrice()<1000 &&m[i].getPrice()>100)
			 { 
				System.out.println(m[i].getId()+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getQty()+m[i].getType());
				}
			
		}
	 }
 }

public class MedicalApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Medical med[]=new Medical[2];
		MedicalDetail m=new MedicalDetail();
		for(int i=0;i<med.length;i++)
		{
			med[i]=new Medical();
			System.out.println("name");
			String name=sc.nextLine();
			System.out.println("type");
			String type=sc.nextLine();
			System.out.println("Id");
			int id=sc.nextInt();
			System.out.println("price");
			int price=sc.nextInt();
			System.out.println("qty");
			int qty=sc.nextInt();
			sc.nextLine();
			med[i].setId(id);
			med[i].setName(name);
			med[i].setPrice(price);
			med[i].setQty(qty);
			med[i].setType(type);
		}
		m.setDetail(med);
		m.DisplayDetail();
		m.gstBill();
		m.PriceMax();
		
	}
}
