//program for area of equilaterial triangle
import java.util.Scanner;
 public class AreaOfEquiTrangle
 {
   public static void main(String x[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the side one side of triangle");
      int a=sc.nextInt();
     // int area=(1.732f*a*a)/4;
      //float area=(1.732f*a*a)/4;
	  double area1=(Math.sqrt(3)*Math.pow(a,2))/4;
     // System.out.printf("Area is %f",area);
	  System.out.printf("Area is %f",area1);
   }
 }