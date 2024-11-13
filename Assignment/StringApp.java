/*Write a java program to create a constructor name as StringApp to accept
charchater array and implement the logic.
Input : - Indian
Search Value : - d
Output : - n i
**/
public class StringApp
{
	char ch[];char  x;
	StringApp(char ch[],char x)
	{
		this.ch=ch;
		this.x=x;
	}
	public void show()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==x)
			{
				System.out.println(ch[i-1]+" "+ch[i+1]);
			}
		}
	}
	
	public static void main(String x[])
	{
		StringApp s=new StringApp(new char[]{'i','n','d','i','a','n'},'d');
		s.show();
	}
	
}

