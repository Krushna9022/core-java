import java.util.*;
public class P10CountOfNum
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int count=0;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		System.out.println(count);
	}
	
} 
