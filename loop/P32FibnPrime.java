import java.util.Scanner;
 class P32FibnPrime
{
   public static void main(String x[])
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the numner N");
       int n=sc.nextInt();
       n=(n-1)+(n-2);
       System.out.println(n);
   }

}