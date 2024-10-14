import java.util.Scanner;
public class StudentEligibleExam
{
 public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the  total number of days");
 int t=sc.nextInt();
 System.out.println("Enter the absent days");
 int  ab=sc.nextInt();
 int per=(ab/t)*100;
 String s=per<=75?" eligible":"Not Eligible";
 System.out.println(s);
 
 
 }
 
}