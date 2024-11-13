/*
Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object
*/
import java.util.*;
public class EmployeeApp
{
	public static void main (String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the detail of employee");
		// Employee emp=new Employee();
		// emp.setId(1);
		// emp.setName("krushna");
		// emp.setSalary(1000.0);
		Employee emp1=new Employee();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		emp1.setId(id);
		emp1.setName(name);
		emp1.setSalary(salary);
		//System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
		System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSalary());
		
	}
}

class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
}