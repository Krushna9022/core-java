import java.util.Scanner;
public class GrossSalaryOfEmployee
{
	public static void main(String []c)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the basic Salary");
	 float salary=sc.nextFloat();
	 float gsalary,HRA,DA;
	  if(salary<=10000)
	  {
	   gsalary=salary+salary*0.2f+salary*0.8f;
	   System.out.println("Your gross Salary is "+gsalary);
	  }
	  else if(salary<=20000)
	  {
	   gsalary=salary+salary*0.3f+salary*0.95f;
	    System.out.println("Your gross Salary is "+gsalary);
	  }
	  else
	  { gsalary=salary+salary*0.25f+salary*0.9f;
	  System.out.println("Your gross Salary is "+gsalary);
	  }
	}
}