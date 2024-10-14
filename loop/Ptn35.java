public class Ptn35
{
	public static void main(String x[])
	{
		for(int i=0;i<5;i++)
		{
			int a=65; 
			for(int j=0;j<9;j++)
			{   
				 if (j<=4-i || j>=4+i)
				 {
					if(j<=4)
					{
						System.out.printf("%c",a+j);
					}
					 else{
						System.out.printf("%c",a+8-j);

					}
					
				 }
				 
				 else 
				 {
					 
					System.out.print(" ");
					// a--;
				 }
			}
			System.out.println();
		}
	}
}