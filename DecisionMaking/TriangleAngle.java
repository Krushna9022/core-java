//program for enter two angle of triangle and calculate third one
import java.util.*;
public class TriangleAngle
{
  public static void main(String x[])
 { int a,b;


    Scanner sc =new Scanner (System.in);
    System.out.println("Enter first angle");
    a=sc.nextInt();
    System.out.println("ENTER second angle of triangle");
    b=sc.nextInt();
   int c= 180-(a+b);
   System.out.printf("third angle is of %d",c);

 }
}