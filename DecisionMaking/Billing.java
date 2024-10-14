import java.util.Scanner;
public class Billing
{
 public static void main(String x[])
 {
  System.out.println("Welcome to bill calcuation");
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter the quantity of the product");
  int qnty=sc.nextInt();
  System.out.println("Enter the price of the product");
 int price=sc.nextInt();
  System.out.printf("the price of the products without gst is %d ",qnty*price);
float gst=(qnty*price*18)/100;
 float total=(qnty*price)+gst;
System.out.printf("bill with gst is %f",total);
 }
}