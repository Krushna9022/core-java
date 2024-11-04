/*
Write a Java program to creating a Plain Old Java Object (POJO) class 
named Employee to represent an employee in a company. 
The class should encapsulate the following attributes and operations
 attributes :name (String),jobTitle (String),salary (double);
 method :1)Constructor 2)Getters 3)updateSalary(double newSalary) 4)applyRaise(double percentage): 5)hasHigherSalary(Employee other): 
 6)isEligibleForBonus() 7)getFormattedSalary() 8)displayInfo()
*/
import java.util.*;
class Employee 
{
	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee(String  name,String jobTitle,double salary)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public String getJobTitle()
	{
		return jobTitle;
	}
	public double getSalary()
	{
		return salary;
	}
	
}

class EmployeeActivity
{
	Employee emp[];
	EmployeeActivity(Employee emp[])
	{
		this.emp=emp;
	}
	public void DisplayDetail()
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("hii");
		}
	}
}

public class EmployeeMangerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[2];
		for(int i=0;i<emp.length;i++)
		{  int a=i;
			
			System.out.println("\nEnter the detail of employee "+(a+1));
			sc.nextLine(); 
			System.out.println("Enter the name ");
			String name=sc.nextLine();
			System.out.println("Enter the jobTitle ");
			String jobtitle=sc.nextLine();
			System.out.println("Enter the salary");
			double sal=sc.nextDouble();	
			emp[i]=new Employee(name,jobtitle,sal);
		}	
		
		EmployeeActivity activity=new EmployeeActivity(emp);
		activity.DisplayDetail();
	}
}