import java.util.Scanner;
public class MintoHr{
public static void main( String  x[])
{
Scanner s=new  Scanner (System.in);
System.out.println("Enter Second to convert into Hr:Min:Sec");
int time=s.nextInt();
 int hr=time/3600;
int rem=time%3600;
int min=rem/60;
rem=rem%60;
System.out.println("Time"+hr+" hr "+min+" min "+rem+" sec" );
}
}



