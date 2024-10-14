//program to check the convert uppercase to lowercase And Lower to uppercase
import java.util.*;
class ConvertUpperToLowerAndViceVersa
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character letter");
		char c=sc.next().charAt(0);
		char s=(c>='a'&&c<='z')?(char)((int)c^32):(char)((int)97^c);
		char d=(char)((int)c^32);
		System.out.println(d);
		
	}
}