import java.util.*;
public class EvenOdd
{
public static void main(String x[])
 {
  Scanner s=new Scanner (System.in);
  System.out.println(" Enter the number ");
  int a=s.nextInt();
  String res=a%2==0?"Even":"Odd";
  System.out.println("Number is"+" "+res);
 }
}