//program to convert hr to sec
import java.util.*;
public class HrtoSec
{
 public static void main( String x[])
 { 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the time in Hour");
   int hr=sc.nextInt();
   System.out.println("Enter the minites");
   int min=sc.nextInt();
   System.out.println("Enter the seconds");
   int sec=sc.nextInt();
   sec=(hr*60*60)+(min*60)+sec;
   System.out.println("Total second is "+sec);
 }
}