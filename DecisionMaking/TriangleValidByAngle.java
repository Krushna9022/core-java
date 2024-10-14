import java.util.*;
public class TriangleValidByAngle {
    public static void main(String[]x) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number please");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("Not valid");
        }
    }
}
