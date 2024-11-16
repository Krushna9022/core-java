import java.util.*;
public class  GuessingGame{

    public static void main(String x[])
    {   Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int  no= r.nextInt(10);
       // System.out.println(no);
        int guess=0;
        boolean b=false;
        while(!b)
        {
            System.out.println("Enter the number between 1 -10");
            guess =sc.nextInt();
            if(no>guess)
            {
                System.out.println("you guess number low ,it should  be greater");
            }else if(no<guess)
            {
                System.out.println("You guess number is high ,it should be less");
            }
            else {
                b=true;
                System.out.println("congrulation ypu guess corredt number!!!!");
            }
        }
    }
   
    
    
}
