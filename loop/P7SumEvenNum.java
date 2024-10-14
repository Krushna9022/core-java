public class P7SumEvenNum
{
	public static void main(String x[])
	{     int sum=0;
		 for(int i=1;i<=100;i++)
		 {  if(i%2==0)
			{
			sum=sum+i;
			}
		 }
		 System.out.println(sum );
	}
}