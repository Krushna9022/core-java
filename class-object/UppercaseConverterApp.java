public class UppercaseConverterApp
{
	public static void main(String x[])
	{
		char ch[]={'k','r','u','s','h','n','a'};
		UppercaseConverter up=new UppercaseConverter();
		up.setCharArray(ch);
		up.convertToUpperCase();
		
		System.out.println();
		
		LowercaseConverter lo=new LowercaseConverter();
		lo.setCharArray(ch);
		lo.convertToLowerCase();
	
	}
}

class UppercaseConverter
{
	char ch[];
	public void setCharArray(char ch[])
	{
			this.ch=ch;
	}
	
	public void convertToUpperCase()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<=122 &&ch[i]>=97)
			{
				ch[i]=(char)((int)(ch[i])-32);
			}
		}
		for(char c :ch)
		{
			System.out.print(c);
		}
	}
}

class LowercaseConverter
{
	char ch[];
	public void setCharArray(char ch[])
	{
			this.ch=ch;
	}
	
	public void convertToLowerCase()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<=90 &&ch[i]>=65)
			{
				ch[i]=(char)((int)(ch[i])+32);
			}
		}
		for(char c :ch)
		{
			System.out.print(c);
		}
	}
}