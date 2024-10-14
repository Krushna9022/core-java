import java.util.*;
public class AtmTransByPooja
{
   public static void main(String x[])
   {
	   Scanner sc=new Scanner(System.in);
	   double trx=sc.nextDouble();
	   if(trx%5==0)
	   {
		   trx=trx+0.5;
		   System.out.println(""+trx);
	   }
	   else
	   {
		   System.out.println(trx);
	   }
   }
}