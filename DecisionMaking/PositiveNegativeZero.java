//if --positive negative and zero
import java.util.*;
public class PositiveNegativeZero
{
public static void main(String x[])
{ 
Scanner sc=new Scanner (System.in);
System.out.println("enter the number ");
int a=sc.nextInt();
if(a<0)
{
	System.out.println("negative");
}
if(a>0)
{
	System.out.println("positive");
}	

if(a==0)
{
	System.out.println("zero");
}
}
}