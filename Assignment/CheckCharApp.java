 /*
 Q.Write program to create class name as CheckChar with two functions
void setChar(char ch): this function accept single character as input
boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false.
*/
import java.util.*;
class CheckChar
{
	char ch;
	public void setChar(char ch)
	{
		this.ch=ch;
	}
	public boolean checkChar()
	{
		if((ch>=65&&ch<=90)||(ch>=97 && ch<=122))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class CheckCharApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		CheckChar check=new CheckChar();
		check.setChar(ch);
		System.out.println(check.checkChar());
	
	}
}
