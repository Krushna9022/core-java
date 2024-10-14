 import java.util.*;
 public class ElectricityBill
 {
  public static void main(String x[])
  {
   Scanner sc=new Scanner (System.in);
   int unit=sc.nextInt();

   double res=(unit<=50)?unit*0.5f:
   
             (unit>50&&unit<100)?unit*0.75f:
			 (unit>100&&unit<200)?unit*1.20f:unit*1.50;


	double charge=(res*0.2);
  double amount=res+charge;
	
  System.out.println(amount);		
	
  }
 } 