class StringApp
{
	char c[];
	public void setData(char c[])
	{
		this.c=c;
	}
	public void frequencyAlphabet()
	{
		System.out.println("Display the array\n");
		for(char ch:c)
		{
			System.out.print(ch+" ");
		}
		
		
		int maxcount=0,highest=-1;
		boolean b[]=new boolean [c.length];
		for(int i=0;i<c.length;i++)
		{	int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					++count;
					b[j]=true;
				}
			}
			
			if(!b[i])
			{
				System.out.print("\n"+c[i]+"------>"+count);
			}
			
			if(maxcount<count)
			{
				maxcount=count;
				highest=i;
			}
		}
		System.out.println("\nhighest count elemnt is "+c[highest]);
	}
}

public class FrequencyApp
{
	public static void main(String x[])
	{
		char c[]={'a','b','a','c','d','d','a'};
		StringApp app=new StringApp();
		app.setData(c);
		app.frequencyAlphabet();
		
	}
}