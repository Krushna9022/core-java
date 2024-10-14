import java.util.*;
class CompoundIntrest
{
	public static void main(String c[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principal amount");
	double p=sc.nextDouble();
	System.out.println("Entert the time in months");
	double time=sc.nextDouble();
	System.out.println("Enter the intrest rate");
	double rate=sc.nextDouble();
	double x=1+rate/100;
	double CompoundIntrest=p*(Math.pow(x,time));
	System.out.println("compund intrest is \t"+CompoundIntrest);	
}
}