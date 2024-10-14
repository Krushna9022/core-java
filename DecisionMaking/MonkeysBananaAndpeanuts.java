import java.util.Scanner;

public class MonkeysBananaAndpeanuts {
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of monnkeys");
		int n = sc.nextInt();
		System.out.println("Enter the total number Bananas");
		int tB = sc.nextInt();
		System.out.println("Enter the  Bananas eat by monkey 1");
		int eatBM = sc.nextInt();
		if (tB > eatBM) 
		{
			if (eatBM % 2 == 0) 
			{
				int eatB = tB / eatBM;
				n = n - eatB;
			} else 
			{
				int eatB = tB / eatBM;
				
				n = n - eatB - 1;
			}
		} 
		else 
		{
			System.out.println("Invalid INput");
		}
	
		System.out.println("monkey remains" + n);
		System.out.println("Enter the total number peanuts");
		int tP = sc.nextInt();
		System.out.println("Enter the  peanuts eat by monkey 1");
		int eatPM = sc.nextInt();
		if (tP > eatPM)
		{
			if (eatPM % 2 == 0) 
			{
				int eatP = tP / eatPM;
				n = n - eatP;
			} else {
				int eatP = tP / eatPM;
				n = n - eatP - 1;
			}
		}	
		else
		{
			System.out.println("invalid");
		}
			System.out.println("monkey remains" + n);

		
	}
}