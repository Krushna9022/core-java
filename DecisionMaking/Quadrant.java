import java.util.*;
public class Quadrant
{
 public static void main(String x[])
{
  Scanner s=new Scanner (System.in);
  System.out.println("enter the value X and Y");
  int a=s.nextInt();
  int b=s.nextInt();
  //String con3=a!=0&b==0?"On y axis":"On x axis";
  String con2=a<0&b<0?"third Quadrant":"fourth Quadrant";
  String con1=a<0&b>0?"Second Quadrant":con2;
  String con=a==0&b==0?"origin":con1;
  String res=a>0&b>0?"First Quadrant":con;
   
   int re1=a==b?a+b:a-b & a>b?a*a:b*b;
  System.out.println(re1);
  //System.out.println(con3);
  System.out.println(res);
}
}