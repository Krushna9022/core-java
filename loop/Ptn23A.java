public class Ptn23A
{
	public static void main(String x[])
	{
	int a=1,c=7;
	
		for(int i=1;i<=8;i++)
		{ 
			for(int j=1;j<=4;j++)
			{
				if(j<=i &&i<=4 )
				{
					System.out.print(a++);
					if(j<i)
					{
						System.out.print("*");
					}
				}
				else if(j<=9-i && i>=5)
				{
				System.out.print(a++);
					if(j<9-i){
					System.out.print("*");
					}
					else if(j==9-i)
					{ c=c/2-1;}
				}
			}	
			 // for(int  k=1;k<=9-i && i>4;k++)
			 // {
				
				
				
			 // }				 
			
			 
			System.out.println();
		}
	}
}