import java.util.*;
public class CandidateEligible
{
public static void main(String x[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the marks in Maths");
 int maths=sc.nextInt();
 System.out.println("Enter the marks in physics");
 int physics=sc.nextInt();
 System.out.println("Enter the marks in chemistry");
 int chem=sc.nextInt();
 String res=(maths>=65&&physics>=55&&chem>=50)||(maths+physics+
 chem>=190)||(maths+physics>=140)?"Eligible":"Not Eligible";
 System.out.println(res);
 }
}