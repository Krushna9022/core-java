/*Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is Rs.50/- (per Hour). Daily shift hour time is only 8 hours.
 Note- for a week only 40 hours of working are allowed.
1. Create class Employee with data member ID, Name, total working,salary, overtime Set Information by using a parameterized constructor and create a display Information() method to display all information with salary.
2. Create another class name as OverTime with method setEmployee(Employee emp[ ]) and void calculateOvertime() to calculate overtime.
*/
import java.util.*;
class Employee
{
	private int id,totalWorking;
	private String name;
	private double salary;
	private int overtime;
	Employee(int id,String name ,int totalWorking,double salary)
	{
		this.id=id;
		this.name=name;
		this.totalWorking=totalWorking;
		this.salary=salary;
		if(totalWorking>41)
		{
			overtime=totalWorking- 40;
		}
	}
	public int  getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getTotalWorking()
	{
		return totalWorking;
	}
	public int getOvertime()
	{
		return overtime;
	}
	public double getSalary()
	{
		return salary;
	}
}

class OverTime
{
	Employee emp[];
	public void setEmployee(Employee emp[])
	{
		this.emp=emp;
	}
	
	public void displayEmployee()
	{
		for(int i=0;i<emp.length;i++)
		{  double increment=emp[i].getOvertime()*50;
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getOvertime()+"\t"+emp[i].getSalary()+"\t"+(emp[i].getSalary()+increment));
		}
	}
}


public class EmployeeOvertimeApp
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[2];
		for(int i=0;i<emp.length;i++)
		{
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int overtime=sc.nextInt();
			double sal=sc.nextDouble();
			emp[i]=new Employee(id,name,overtime,sal);
		}
		//emp[0]=new Employee(1,"kkp",50,500.0);
		
		OverTime ot=new OverTime();
		ot.setEmployee(emp);
		ot.displayEmployee();
		
	}
}