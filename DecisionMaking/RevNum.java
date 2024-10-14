//program to reverse the entered number;
 import java.util.*;
 public class RevNum
{
  public static void main(String x[])
 {
  int no,rem,rev=0;
   Scanner s=new Scanner(System.in);
  System.out.println("Enter three digit number");
  no=s.nextInt();
  rem=no%10;
  no=no/10;
  rev=rev+(rem*100);

  rem=no%10;
  no=no/10;
  rev=rev+(rem*10);

  rem=no%10;
  no=no/10;
rev=rev+rem;
System.out.println(rev);
}}