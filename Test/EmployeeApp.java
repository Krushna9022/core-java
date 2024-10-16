import java.util.*;
 class Employee
{
	private int id;
	private String name;
	private int sal;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{return id;
	}
	
	public void setName(String name)
	{	this.name=name;
	}
	public String getName()
	{	return name;
	}
	
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	
}

class EmployeeDetail
{
	Employee emp[];
	public void setDetail(Employee ...emp)
	{
		this.emp=emp;
	}
	public void getDetail()
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
		}
	}
	
	public void updateDetail()
	{
		//update the information if name="ram" or Salary is 1000
		boolean f=false;
		System.out.println("updating information....");
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getName().equals("Ram") || emp[i].getSal()==1000)
			{
				emp[i].setId(5);
				emp[i].setName("Rohan");
				emp[i].setSal(5000);
				f=true;
			}
		}
		if(f)
		{
		getDetail();
		System.out.println("updated sucessfully");
		}
		else
		{
			System.out.println("no record found to update!");
		}
	}
	
	public void sortDetailById()
	{
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i;j<emp.length;j++)
			{
				if(emp[i].getId()>emp[j].getId())
				{
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		getDetail();
	}
	
	
}

public class EmployeeApp
{
	public static void main(String x[])
	{
		Employee emp1=new Employee();
		emp1.setId(8);
		emp1.setName("Ram");
		emp1.setSal(2000);
		
		Employee emp2=new Employee();
		emp2.setId(6);
		emp2.setName("Krushna");
		emp2.setSal(4000);
		
		Employee emp3=new Employee();
		emp3.setId(7);
		emp3.setName("Gaurav");
		emp3.setSal(500);
		EmployeeDetail ed=new EmployeeDetail();
		ed.setDetail(emp1,emp2,emp3);
		Scanner sc=new Scanner(System.in);
		System.out.println("1.get detail");
		System.out.println("2.update  detail  if name is ram or salary  is 1000");
		System.out.println("3.sort all list by id");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				ed.getDetail();
				System.out.println("=======================");
				break;
			case 2:
				ed.updateDetail();//update the information if name="ram" or Salary is 1000
				System.out.println("=======================");
				break;
			case 3:
				ed.sortDetailById();
				System.out.println("=======================");
			break;
			default:
				System.out.println("Invalid input");
				System.out.println("existing program");
		}
	}
}
