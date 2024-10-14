      import java.util.*;
      public class EmployeeInsuranceCheck
  {
     public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the age");
	int age=sc.nextInt();
	System.out.println("Enter marital(y/n) ");
	char status=sc.next().charAt(0);
	System.out.println("Enter the gender (m/f)");
	char gender=sc.next().charAt(0);
	  
	String res=(status=='y')||(status=='n'&&gender=='m'&&age>=35)
	||(status=='n'&&gender=='f'&&age>=25)?"yes company can insured":"no insured";
	
	System.out.println(res);
	
  }
}