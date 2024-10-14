//program to sum integer number
import java.util.*;
public class IntSum
{ 
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number three digit" );
    int no=sc.nextInt();
    int rem=no%10;
    no=no/10;
    int v=0;
    v=v+rem;

    rem=no%10;
    no=no/10;
    v=v+rem;
   
   rem=no%10;
   v=v+rem;

 

System.out.println(v);
int n=sc.nextInt();
   n=(n%10)+((n/10)%10)+n/100;
System.out.println(n);
  }
}