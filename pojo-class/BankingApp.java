/*Create a Plain Old Java Object (POJO) system for a banking application that includes the following classes and functionality:
Class: Account
The Account class should represent a bank account and contain the following attributes and methods
Attributes:
accountNumber (String): The unique identifier for the account.
accountHolderName (String): The name of the account holder.
balance (double): The current balance in the account.
Methods:
A constructor to initialize the attributes.
Getter methods for each attribute.
A method deposit(double amount) to add money to the account.
A method withdraw(double amount) to withdraw money from the account, ensuring that the balance does not go negative.
A method displayAccountInfo() to print the account details.

Class: Bank
The Bank class should manage a collection of Account objects and include the following methods:
Methods:
A method addAccount(Account account) to add a new account to the bank.
A method removeAccount(String accountNumber) to remove an account from the bank based on the account number.
A method findAccount(String accountNumber) to search for an account by its number and return it.
A method totalBalance() to calculate and return the total balance of all accounts in the bank.
A method displayAllAccounts() to print the details of all accounts in the bank.	*/
import java.util.*;
class Account
{
	private String accno;
	private String accHolder;
	private double balance;
	
	public Account(String accno,String accHolder,double balance)
	{
		this.accno=accno;
		this.accHolder=accHolder;
		this.balance=balance;
	}
	 public String getAccno() {
        return accno;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public double getBalance() {
        return balance;
    }
	
	
	public void deposit(double amount)
	{
		System.out.println("Account bal is"+balance);
		balance=balance+amount;
		System.out.println("Account bal is credit by"+amount+"\nAccount bal is"+balance);
	}
	
	public void withdraw(double amount)
	{
		if(balance>amount)
		{
		balance=balance-amount;
		System.out.println("Account bal is debit by"+amount+"\nAccount bal is"+balance);
		}
		else
		{
			System.out.println("Insufficient balance ");
		}
	}
	public void displayAccountInfo()
	{
		System.out.println(getAccno()+"\t"+getAccHolder()+"\t"+getBalance());	
	}
}

class Bank
{
	Account accounts[];
	int count;
	
	public Bank(int maxacc)
	{
		accounts = new Account[maxacc];
		count=0;
	}
	 public void addAccount(Account account)
	 {
		if(count<accounts.length)
		{
			accounts[count]=account;
			count++;
			System.out.println("Account added "+account.getAccno());
		}
		else{
			System.out.println("out of limit");
		}
	
	 }
	 public void removeAccount(String accountNumber)
	 {
		 int k;
		for(int i=0;i<count;i++)
		{
			k=i;
			if(accounts[i].getAccno().equals(accountNumber))
			{
				accounts[i]=null;
				for(int j=i+1;j<count;j++)
				{
					accounts[k]=accounts[j];
					k++;
				}
				count--;
				System.out.println("Account removed\n==========================");
			}
		}
	 }
	 public void findAccount(String accountNumber)
	 {
		 for(int i=0;i<count;i++)
		 {
			 if(accounts[i].getAccno().equals(accountNumber))
			 {
				 System.out.println(accounts[i].getAccno()+"\t\t"+accounts[i].getAccHolder()+"\t\t"+accounts[i].getBalance());
			 }
		 }
		 
	 }
	 public void totalBalance()
	 {
			double totalbal=0;
		for(int i=0;i<count;i++)
		{
			totalbal=totalbal+accounts[i].getBalance();
		}
		System.out.println("Total balance in bank is "+totalbal);
	 }
	 public void tansaction(String accountNumber)
	 {	boolean f=true;
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<count;i++)
		 {
			 if(accounts[i].getAccno().equals(accountNumber))
			 {	f=false;
				 System.out.println("1.deposite");
				 System.out.println("2.withdraw");
				 System.out.println("3.Display account detail");
				 System.out.println("============================");
				 System.out.println("enter the choice");
				 int c=sc.nextInt();
				 switch(c)
				 {
					case 1:
						System.out.println("enter the amount to deposite");
						double d=sc.nextDouble();
						if(d>0)
						{
							accounts[i].deposit(d);
						}
						else
						{
							System.out.println("invalid amount");
						}
						break;
					case 2:
						System.out.println("enter the amount to withdraw");
						double w=sc.nextDouble();
						if(accounts[i].getBalance()>w)
						{
							accounts[i].withdraw(w);
						}
						else
						{
							System.out.println("invalid amount");
						}
						break;
					case 3:
						accounts[i].displayAccountInfo();
						break;
				 }
			 }
		 }
		 if(f)
		 {
			 System.out.println("no account found");
		 }
	 }
	 public void displayAllAccounts()
	 {
		 for(int i=0;i<count;i++)
		 {
			System.out.println(accounts[i].getAccno()+"\t"+accounts[i].getAccHolder()+"\t"+accounts[i].getBalance());
		 }
	 }
}
public class BankingApp
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		Bank bank=new Bank(5);
		int choice;
		System.out.println("===========***Welocme***==============\n");
		do
		{	System.out.println("1.Add Account");
			System.out.println("2.Dispaly detail");
			System.out.println("3. Remove Account ");
			System.out.println("4.find account detail by account number");
			System.out.println("5.total balance of all accounts in banks");
			System.out.println("6.Transaction of account");
			System.out.println("7.exit");
			
			System.out.println("Enter the choice");
			 choice=sc.nextInt();
			int count=0;//to store the 
			switch(choice)
			{
				case 1:
					sc.nextLine();
					System.out.println("enter the account number");
					String accno=sc.nextLine();
					System.out.println("enter the account holder name");
					String accHolder=sc.nextLine();
					System.out.println("enter the account Balance");
					double accbal=sc.nextDouble();
					Account accCount=new Account(accno,accHolder,accbal);
					bank.addAccount(accCount);
					break;
				case 2:
					System.out.println("************ Display All Account detail***********");
					bank.displayAllAccounts();
					break;
				case 3:
					System.out.println("Enter the account no to delete the detail");
					sc.nextLine();
					String delacc=sc.nextLine();
					bank.removeAccount(delacc);
					break;
				case 4:	
					sc.nextLine();
					System.out.println("enter the account number to find the detail of accounts");
					String findaccno=sc.nextLine();
					bank.findAccount(findaccno);
					break;
				case 5:
						bank.totalBalance();
					break;
				case 6:
					sc.nextLine();
					System.out.println("enter the account number to make transcation");
					String trans=sc.nextLine();
					bank.tansaction(trans);
				case 7:
					System.out.println("Existing the App");
					break;
				default:
					System.out.println("Invalid case");
					
			}
		}
		while(choice<7);
		
	}
}