import java.util.*;
class CharArray
{    char ch[];
	public void setCharArr(char ch[])
	{
		this.ch=ch;
	}
}

class ConvertToUppercase extends CharArray
{
	char [] getConvertedArray()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=((char)((int)ch[i]-32));
			}
		}
		return ch;
	}
}

class ReverseChar extends CharArray
{
	char [] reverseArray()
	{	int j=ch.length-1;
		for(int i=0;i<ch.length/2;i++)
		{
			if(i<j)
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				j--;
			}
		}
		return ch;
	}
}

class FindCaptialLetter extends CharArray
{
	public void findCapitalLetter()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
	
}


public class CharArrayOperation
{
	public static void main(String x[])
	{	char ch[]=new char[5];
		System.out.println("Enter the character Array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		ConvertToUppercase up=new ConvertToUppercase();  //obj of ConvertToUppercase class
		up.setCharArr(ch);
		char res[]=up.getConvertedArray();
		for(char i :res)
		{
			System.out.print(i+" ");
		}
		
		ReverseChar revarr=new  ReverseChar();  //object of ReveseChar
		revarr.setCharArr(ch);
		char rev[]=revarr.reverseArray();
		System.out.println("\nprintg the array in reverse");
		for(char i :rev)
		{
			System.out.print(i+" ");
		}
		FindCaptialLetter find =new FindCaptialLetter();
		find.setCharArr(new char []{'G','a','u','r','a','V'});
		System.out.println("\n capital letter from array");
		find.findCapitalLetter();
	}
}

