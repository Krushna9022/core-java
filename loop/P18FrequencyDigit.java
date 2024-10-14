import java.util.Scanner;
class P18FrequencyDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the find repated digit");
		int b=sc.nextInt();
		int count=0;
		while(a>0)
		{
		 int rem=a%10;
		 if(rem==b)
		 {
			count++;
		 }
		 a=a/10;
		}
		System.out.println(b +"is Reapated"+ count);
	}
}