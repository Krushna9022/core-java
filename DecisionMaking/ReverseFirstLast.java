import java.util.Scanner;
public class SwapFirstLast
{
 public static void main(String x[])
 {
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter the four digit number");
     int a=sc.nextInt();
     int f=a%10;//extract the last digit
     a=a/10;//remove last digit;
     int l=a/100;//extract the first digit;
     a=a%100; //remove first digit;
	 //replace the digit places
	 a=(f*1000)+(a*10)+l;
   
 System.out.println("no is :"+a);
 }
}