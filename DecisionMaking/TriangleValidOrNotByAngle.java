import java.util.*;
public class TriangleValidOrNotByAngle
{
	public static void main (String x[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three angles");
int angle1=sc.nextInt();
int angle2=sc.nextInt();
int angle3=sc.nextInt();
//System.out.println("Enter the three sides of triangle");
//int side1=sc.nextInt();
//int side2=sc.nextInt();
//int side3=sc.nextInt();

int con1=(angle1+angle2+angle3);
//boolean con2=(side1+side2)>side3;
String s=(con1==180)?"this is triangle":"Not triangle";
System.out.println(s);
}
}