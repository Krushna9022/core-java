import java.util.*;
class Account
{
	private long accNo;
	private String accHolder;
	private double balance;
	
	public void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	public long getAccNo()
	{
		return accNo;
	}
	public void setAccHolder(String accHolder)
	{ 
		this.accHolder=accHolder;
	}	
	public String getAccHolder()
	{
		return accHolder;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
}

class AccBalance
{
	Account acc;
	AccBalance(Account acc)
	{
		this.acc=acc;
	}
	
	public void withdraw(double bal)
	{
		if(bal<acc.getBalance())
		{
			double balance = acc.getBalance()-bal;
			System.out.println("withdraw sucessfully");
			acc.setBalance(balance);
		}
		else
		{
			System.out.println("account does not have that much balance");
		}
	}
	public void deposite(double bal)
	{
		double balance = acc.getBalance()+bal;
		System.out.println("deposite sucessfully");	
		acc.setBalance(balance);
	}
	public void showDetail()
	{
		//if(acc.getAccNo==accno)
		{
			System.out.println(acc.getAccNo()+"\n "+acc.getAccHolder()+"\n"+acc.getBalance());
		}
	}
}

public class BankApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Account acc=new Account();
		System.out.println("Enter the account number");
		long accno=sc.nextInt();
		acc.setAccNo(accno);
		acc.setAccHolder("krushna");
		acc.setBalance(500);
		
		AccBalance bal=new  AccBalance(acc);
		bal.showDetail();
		int choice;
		do{
			System.out.println("Enter the choice");
			 choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					bal.withdraw(300);
					bal.showDetail();
					break;
				case 2:
					bal.deposite(600);
					bal.showDetail();
					break;
				case 3:
					System.out.println("existing ...");
					break;
				default:
					System.out.println("invalid choice");
			}		
		}while(choice!=3 );
		
	}
}