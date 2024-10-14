import java.util.*;
class TriangleIsEquiIsocScalen
{
public static void main(String x[])
{Scanner sc=new Scanner(System.in);
System.out.println("Enetr the sides of Triangle");
int a=sc.nextInt();
int c=sc.nextInt();
int b=sc.nextInt();
if(a==b&&b==c)
{
	System.out.println("Equilateral Triangle");
}
else if((a==b&&b!=c)||(a==c&&b!=c)||(b==c&&a!=c))//5==5 &&5 
{
	System.out.println("Isosceles  Triangle");
}
else {
	System.out.println("Sceles Triangle");
}

}
}