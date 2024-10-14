import java.util.Scanner;

public class VolumeChef
{
   public static void main(String x[])
  {int res;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the current volume");
	int vol1=sc.nextInt();
	System.out.println("You current volume of TV is "+vol1+" \n what volume you want");
	int vol2=sc.nextInt();
	if(vol1>vol2)
	{
		 res=vol1-vol2;
		 System.out.println("volume decrease by "+res);
		 System.out.println("Now the current volume is "+(vol1-res));
	}
	else
	{
	   res=vol2-vol1;
	   System.out.println("volume increase by "+res);
	   System.out.println("Now the current volume is "+(vol1+res));
	}
	
  }
}