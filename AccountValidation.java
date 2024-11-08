class Account{
	private  String accno;
	private int accbal;
	
	Account (String accno,int accbal)
	{
		if(accno==null ||accno.isEmpty())
		{
			System.out.println("Account number is null or empty");
			return;
		}
		if(accbal<0)
		{
			System.out.println("Account balance is cannot be negative ");
			return;
		}
		this.accbal=accbal;
		this.accno=accno;
	}
	
	public int getBal()
	{
		return accbal;
	}
	public String getAccNo()
	{
		return accno;
	}
}

public class AccountValidation
{
	public static void main(String x[])
	{
		//Account acc=new Account("",456);//account is empty;
		//Account accbal=new Account("Mahb000123",-123);// aacount bal with negative;
		Account valid=new  Account("M600386866",500);
			System.out.println("Account Number"+valid.getAccNo());
			System.out.println("Account balance "+valid.getBal());
		
		
	}
}