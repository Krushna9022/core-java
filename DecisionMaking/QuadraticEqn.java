import java.util.*;
import java.lang.*;
public class QuadraticEqn
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of  a");
	double a=sc.nextInt();
	System.out.println("Enter the value of  b");
	double b=sc.nextDouble();
	System.out.println("Enter the value of  c");
	double c=sc.nextDouble();	
	double d=(b*b)-(4*a*c);
        System.out.println("value of determinant "+d);
	double root1,root2;
	if(d>0)
	{
	System.out.println("hello");

        root1= (-b-Math.sqrt(d))/2*a;
	root2=(-b+Math.sqrt(d))/2*a;
        System.out.println("D>0"+"Root are real and different"+"\t"+root1+"\t"+root2);

	}
	else if(d==0)
	{
	root1=(-b/2*a);
	System.out.println("D=0"+"Roots are real and equal"+"Root1=Root2= "+root1);
	}	
	else
	{
         double real=-b/2*a;
	double imaginary=(-b+Math.sqrt(d))/2*a;
	System.out.println("D<0"+"roots are unequal and imaginary"+"root1="+real+""+imaginary+ "and" +"root2"+real+ 	"-"+imaginary);
	}
}
}