/*
Suppose you have a Piggie Bank with an initial amount of $50 and you have to add
some more amount to it. Create a class 'AddAmount' with a data member named
'amount' with an initial value of $50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.
*/
public class PiggieBankApp
{
	public static void main(String x[])
	{
		AddAmount add1=new AddAmount();
		AddAmount add2=new AddAmount(50);
	}
}

class AddAmount
{
	int initial=50;
	AddAmount()
	{
		System.out.println("balance  in the bank is "+initial);
	}
	public AddAmount(int add)
	{
		initial=initial+add;
		System.out.println("balance in the bank is  "+initial);
	}
}
