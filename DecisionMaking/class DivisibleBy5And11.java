//java program divisible by 5 And 11
class DivisibleBy5And11
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the sides of Triangle");
		int a=sc.nextInt();
		if(a%5==0)
		{System.out.println("Divisible by 5");
		}
		else if(a%11==0)
		{System.out.println("Divisible by 11");
		}
		else
		{
			System.out.println("Divisible by other number");
		}
	}
}