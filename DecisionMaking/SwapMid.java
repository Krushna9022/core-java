import java.util.*;
public class SwapMid
{
	public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Number  of five digits");
     int a=sc.nextInt();//12345
     int l=a%10;//extract last digit l=5
      a=a/10;//delete last digit  a=1234
     int f=a/1000;//extract first digit; f=1
     a=a%1000;//delet the first digit;a=234
	
	 //swap the 234
	 int rem,rev=0;
	  
	 rem =a%10;  //4
	 a=a/10;  //23
     rev=rev+(rem*100); //400
	  
	  rem=a%10; //3
	  a=a/10; //2
	  rev=rev+(rem*10); //430
	
	 rem=a%10;
	 rev=rev+rem;//432
	
	a=(f*10000)+(rev*10)+l; //10000+4320+5
	System.out.println("the number is"+a);
      	      
 }
}