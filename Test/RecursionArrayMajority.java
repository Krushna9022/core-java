public class RecursionArrayMajority
{
	static int f=1;
	public static void main(String x[])
	{
		int a[]=new int[]{1,1,3,3,3,3,1};
		int b=(isMajority(a,1,0,1));
		if(b==1)
		{
		System.out.println("Majority");
		}
			else
			{
				System.out.println("Not");
			}
	}
	//without recursion
	
	// public static void isMajority(int a[])
	// {
		// boolean flag=true;
		// for(int i=0;i<a.length;i++)
		// {
			// int count=1;
			// for(int j=i+1;j<a.length;j++)
			// {
				// if(a[i]==a[j])
				// {
					// count++;
					// if(count>a.length/2)
					// {
						// flag=false;
						// System.out.println("majority elements");
					// }
				// }
			// }
		// }
		// if(flag)
		// {
			// System.out.println("no majority");
		// }
		
	// }
	
	public static int isMajority(int a[],int count,int i,int j)
	{
		if(i<a.length)
		{
			if( j<a.length  && a[i]==a[j] )
			//if(  a[i]==a[j] && j<a.length  )   //out of bond
			{
				count++;
			}
			if(count>a.length/2)
			{
				return 1;
			}
			if(j>=a.length)
			{
				return isMajority(a,1,i+1,i+2);
			}
			return isMajority(a,count,i,j+1);
		}
		
		return -1;
	}
}