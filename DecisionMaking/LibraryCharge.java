import java.util.*;
public class LibraryCharge
{ public static void main(String x[])
  {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the number of days");
   int days=sc.nextInt();
      
   int charge=(days<=5)?2*days:
              (days>5&&days<=10)?3*days:
			  (days>10&&days<=15)?4*days:5*days;
	System.out.println("total charges of library for you is "+charge+" Rs");		  
              			  
  }
}