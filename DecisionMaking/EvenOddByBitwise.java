import java.util.Scanner;
public class EvenOddByBitwise{
	public static void main(String x[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a weather");
	    int a=sc.nextInt();
	     //String d=a%2==0?"even":"odd";    //by conditional
	     String d=(a^1)>a?"even":"odd"; //by bitwise
		  	  
         System.out.printf("the weather is%s",d);
        
	}
}