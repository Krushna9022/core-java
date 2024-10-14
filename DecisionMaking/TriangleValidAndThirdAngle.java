import java.util.*;
public class TriangleValidAndThirdAngle
{

  public static void triangleValid()
   { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the angle1 of triangle");
    	int a=sc.nextInt();
     	System.out.println("Enter the angle2 of triangle");
    	int b=sc.nextInt();
    	System.out.println("Enter the angle2 of triangle");
    	int c=sc.nextInt();
   
    	if((a+b+c)==180)
		{
		System.out.println("valid triangle");
		}
   	else 
		{
		System.out.println("Not valid triangle");
		}
   }

	public static void calculateThirdAngle()
	{
	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the angle1 of triangle");
    	int a=sc.nextInt();
     	System.out.println("Enter the angle2 of triangle");
    	int b=sc.nextInt();
         int c=180-(a+b);
	System.out.println("measure of third angle is"+c);
	}
 
	 public static void main(String []x6)
     {
        Scanner sc=new Scanner (System.in);
	System.out.println("Enter 1 for valid triangle or \n 2 find third angle");
        int x=sc.nextInt();
        if(x==1)
        {
	calculateThirdAngle();
        }
       else if(x==2){
        triangleValid();
    } 
    else
   {
	System.out.println("Not valid ");
   }
   }
}