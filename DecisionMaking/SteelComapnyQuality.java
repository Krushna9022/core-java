import java.util.Scanner;
class SteelComapnyQuality
{
 public static void main(String x[])
 {
	  Scanner  sc=new Scanner (System.in);
	  System.out.println("enter the hardness between 10 -100");
	  int h=sc.nextInt();
	  System.out.println("enter the carbon content between 0.1 -1.5");
	  float c=sc.nextFloat();
	  System.out.println("enter the tensil strength between 5000-9000");
	  int t=sc.nextInt();
	  String s=(h>50  &&  c<0.7 &&  t>5600)?"garde 10":
	           (h>50  &&  c<0.7 &&  t<5600)?"grade 9" :
			   (h<50  &&  c<0.7 &&  t>5600)?"grade 8" :
               (h>50  &&  c>0.7 &&  t>5600)?"grade 7" :"Grade 6";
	 System.out.println(s);								 
 }
}