import java.util.*;
public class Circle{
public static void main(String x[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of circle");
int r=sc.nextInt();
int di=2*r;
float circ=2*3.14f*r;
System.out.printf("diametr of circle is %d",di);
System.out.printf("\ncircumference is%f",circ);
}
}