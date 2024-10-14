import java.util.*;
public class  ProfitLoss
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the cost price");
   int cp=sc.nextInt();
   System.out.println("Enter the selling price :");
   int sp=sc.nextInt();
   
   String r=sp>=cp?"Profit":"Loss";
   System.out.println(r);
 }
}