import java.util.Scanner;
public class QuadrantApp
{
 public static void main(String c[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter cordinates (x,y)");
  int x =sc.nextInt();
  int y= sc.nextInt();//way to use for multiple cases
  String res= (x>0&&y>0)?"First Quadrant":
              (x<0&&y<0)?"Third Quadrant":
			  (x>0&&y<0)?"Fourth Quadrant":
			  (x<0&&y>0)?"Second Quadrant":
			  (x!=0&&y==0)?"On X-axis":
			  (x==0&&y!=0)?"On Y-axis":"Origin";
			  
  System.out.println(res);			  
 }
}