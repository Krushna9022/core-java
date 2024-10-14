//program to check the number is positive or negative by bitwise operaotor;

import java.util.Scanner;
public class NegativePositiveOrZeroByBitwise
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("You enter : "+a);
		 a=1+(a>>31)-(-a>>31);
		 //use the formula to solve 
		 // a==0 then a negative;
		 //a==2  then positive
		 //a==1 then zero
		 
		 
		 String s=a==2?"positive":
                  (a==0)?"negative":"zero"; 		 
		System.out.println( "Number is "+s);
		
	
	}
}