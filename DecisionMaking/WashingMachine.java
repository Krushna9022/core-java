import java.util.*;
public class WashingMachine
{
	public static void main(String x[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the weight of clothes\n weight should be 0gms-7000grms");
 	  int weight=sc.nextInt();
          if(weight<=2000)
	  {
		System.out.println("25 minutes takes");
	  }
	  else if(weight>=2001 && weight<=4000)
	  {
		System.out.println("35 minutes takes");
          }
           else if(weight>=4001 && weight<=7000)
	  {
		System.out.println("45 minutes takes");
          }
	  else
	  {
           System.out.println("overloaded");

	  }
		
	}
}