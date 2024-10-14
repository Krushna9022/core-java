import java.util.Scanner;
public class RoadTaxBike
{
public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the cost price of the vehicle");
  int cp=sc.nextInt();
  double tax=(cp>100000)?(cp*15)/100:
             (cp>50000&&cp<=100000)?(cp*10)/100:(cp*5)/100;
  System.out.println("welcome !please pay "+tax+"Rs tax");			 
 }
}