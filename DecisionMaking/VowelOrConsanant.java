import java.util.Scanner;
public class VowelOrConsanant
{
	public static void main(String [] x)

     {
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character");
	char c=sc.nextLine().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
	System.out.println(c+" is a vowel");
	}
	else
	{
	System.out.println(c+" is consanant");
	}
     }


}