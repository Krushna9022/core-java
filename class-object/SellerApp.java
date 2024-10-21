import java.util.*;
public class SellerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the costPrice");
		int cp=sc.nextInt();
		System.out.println("Enter the Selling Price");
		int sp=sc.nextInt();
		Seller seller=new Seller();
		seller.setCostPriceSellPrice(cp,sp);
		seller.showProfitLoss();
	}
	
}

class Seller
{
	int cp,sp;
	public void setCostPriceSellPrice(int cp,int sp)
	{
		this.cp=cp;
		this.sp=sp;
	}
	public  void showProfitLoss()
	{
		if(cp>sp)
		{
			System.out.println("profit of "+(cp-sp));
		}
		else if(cp==sp)
		{
			System.out.println("Neither profit nor Loss "+(sp-cp));
		}
		else
		{
			System.out.println("loss of "+(sp-cp));
		}
	}
	
}