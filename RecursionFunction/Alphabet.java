public class Alphabet
{
	public static void main(String x[])
	{
		int a=65;
		alphabetPrint(a);
	}
	public static void  alphabetPrint(int a)
	{
		if(a<=90)
		{
		System.out.printf("%c  ",a);
		 alphabetPrint(a+1);
		}
		
	}
}