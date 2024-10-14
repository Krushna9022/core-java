import java.util.Scanner;
public class ChefVsEinstein
{
	public static void main(String x[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Einstine IQ  of physics is 170");
     System.out.println("Enter the IQ of chef in physics");
		int IQ=sc.nextInt();
		if(IQ>=170)
		{
			System.out.println("Invvalid Input");
		}
		
		else if(IQ<170)
		{
			IQ=IQ+10;
			if(IQ>170)
			{
				System.out.println("yes beat the Einstine");
			}
			else
			{ 
			System.out.println("no You can't beat  Einstine .he is birllint");
			}
		}
	}
}
