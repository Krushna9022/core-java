import java.util.*;
public class MinNotes
{
 public static void main(String x[])
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the amount to count minimum notes are required ");
  int note=sc.nextInt();
  int a=note/500;
  int rem=note%500;
  
 int  b=rem/100;
  rem=rem%100;
  
  int c=rem/50;
  rem=rem%50;
  
 int  d=rem/20;
  rem=rem%20;
  
   
  int f=rem/10;
  rem=rem%10;
  
  int g=rem/5;
   rem=rem%5;
   
 int h=rem/2;
  rem=rem%2;
  
  System.out.println("500 :"+a+" 100 :"+b+" 50 :"+c+" 20 :"+d+" 10 :"+f+" 5 :"+g+" 2:"+h+" 1:"+rem);
  
 }
}