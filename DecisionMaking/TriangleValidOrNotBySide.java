import java.util.*;
public class TriangleValidOrNotBySide

{
	public static void main (String x[])
	{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the three sides of triangle");
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();
boolean con=(side1+side2)>side3;
String s=con?"this is triangle":"Not triangle";
System.out.println(s);
}

