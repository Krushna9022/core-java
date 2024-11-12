class TestChar
{ 	char ch[];
	void setCharArray(char ch[])
	{
		this.ch=ch;
	}
}

class UpperCase extends TestChar
{
	void uppercaseConverter()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
	}
	void show()
	{
		for(char c:ch)
		{
			System.out.print(c);
		}
	}
}

class ReverseWord extends TestChar
{
		void revWord()
		{
			int end=ch.length-1;
			for(int i=0;i<ch.length/2;i++)
			{
				if(i<end)
				{
					char temp=ch[i];
					ch[i]=ch[end];
					ch[end]=temp;
					end--;
				}
				
			}
			for(char c:ch)
			{
				System.out.print(c);
			}
		}
}
public class CharArrApp
{
	public static void main(String x[])
	{
		UpperCase up=new UpperCase();
		up.setCharArray(new char[]{'k','r','u','s','h','n','a'});
		up.uppercaseConverter();
		up.show();
		System.out.println();
		ReverseWord rev=new ReverseWord();
		rev.setCharArray(new char[]{'k','r','u','s','h','n','a'});
		rev.revWord();
	}
}
