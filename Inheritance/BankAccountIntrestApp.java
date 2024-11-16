class BankAccount
{
	private String accnumber;
	private double bal;
	public BankAccount(String accnumber,double bal)
	{
		this.accnumber=accnumber;
		this.bal=bal;
	}
	
	public String getAccNo()
	{
		return accnumber;
	}
	public double getBal()
	{
		return bal;
	}
	public void deposite(double amount)
	{
		if(amount>0)
		{
			bal+=amount;
			System.out.println("amount deposite "+amount+" Account bal is "+bal);
		}
		else
		{
			System.out.println("amount cannot added");
		}
	}
	
	public void withdraw(double amount)
	{
		if(bal>amount)
		{	bal-=amount;
			System.out.println("amount withdraw "+amount+" Account bal is "+bal);
		}
	}
	public void displayDetail()
	{
		System.out.println("Acc No :"+getAccNo()+"\nAcc bal :"+getBal());
	}
}

class SavingsAccount extends BankAccount
{
	private double intrestRate;
	public SavingsAccount(String accnumber,double bal,double intrest)
	{
		super(accnumber,bal);
		if(intrest>0)
		{
			this.intrestRate=intrest;
		}
		else
		{
			System.out.println("intrest cannot cannot set ");
		}
	}
	
	public void applyIntrest()
	{
		double si=getBal()*(intrestRate/100);
		System.out.printf("\nintrest on the amount is %.2f\n",si);
		deposite(si);
	}
}

public class BankAccountIntrestApp
{
	public static void main(String x[])
	{
		SavingsAccount save=new SavingsAccount("Mah1234",1000,8.5);
		save.deposite(100);
		save.getBal();
		
		save.withdraw(500);
		save.getBal();
		save.applyIntrest();
		
		save.displayDetail();
	}
}