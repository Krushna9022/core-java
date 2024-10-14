import java.util.*;
 public class CandidateVoteElig
{
  public static void main(String x[])
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
     if(a>18)
	 {
		 System.out.println("Eligible to vote");
	 }
	 else{
		 System.out.println("Not  to vote");
	 }
  }
}