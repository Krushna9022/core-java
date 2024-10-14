public class P1NaturalNumber
{
	public static void main (String x[])
	{
	 int a=1;
	//System.out.println( naturalNum(a,100));
	//System.out.println(revNatural(100));
	sumNatural(1,10,0);
	}
	 
	public static int  naturalNum(int x,int y)
	{
		if(x<=y)
		{
		System.out.print(x+" ");
		x++;
		return  naturalNum(x,y);
		}
		return 0;
		
	}
	
	public static int  revNatural(int x)
	{
		if(x>=1)
		{
		System.out.print(x+" \t");
		x--;
		return revNatural(x);
		}
	 return 0;
	}
	
	public static void sumNatural(int a,int n,int sum)
	{
		if(a==n)
		{
			sum+=a;
			System.out.println(sum+" ");
			return ;
		}
			sum+=a;
			sumNatural(a+1,n,sum);
			
		// else {
		// System.out.print(sum +" " );
		// }
	}	
}