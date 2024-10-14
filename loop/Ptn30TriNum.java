class Ptn30TriNum
{
	public static void main(String x[])
	{
		boolean flag=true;
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for( int j=1;j<=7;j++)
			{
				
			  if(j>=5-i &&j<=3+i && flag)
			  {
			   System.out.print(a);
				++a;
				flag=false;
			  }
			  else
			  {
				System.out.print(" ");
				flag=true;
			  }
			}
		  System.out.println();
		}
	}
}