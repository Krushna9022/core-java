import java.util.*;
public class ManifactureVehicle
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of vehicle to manifacture");
int v=sc.nextInt();
System.out.println("Enter the total wheels");
int w=sc.nextInt();
int tv=((4*v)-w)/2;
int fv=v-tv;
System.out.println("Two wheelers\t"+tv+"\t4 wheeler\t"+fv);
}
}