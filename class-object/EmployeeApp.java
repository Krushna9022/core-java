import java.util.*;
class Employee
{
	int id,sal,progress;
	double incsal;
	String name;
	
	public void setPersonalInfo(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public void setProgress(int progress)
	{
		//this.progress=progress;
		if(progress>=70)
		{
			  incsal=sal+sal*0.3f;
			// System.out.println(incsal);
		}
	}
	public void showInfo()
	{
		System.out.println(name+"\t"+id+"\t"+ sal+"\t"+incsal);
	}
}

public class EmployeeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Employee s=new Employee();
		System.out.println("Enter the id ");
		int id=sc.nextInt();
		System.out.println("Enter the salary");
		int sal=sc.nextInt();
		System.out.println("Enter the name ");
		sc.nextLine();
		String name=sc.nextLine();
		s.setPersonalInfo(name ,id,sal);
		s.setProgress(80);
		s.showInfo();
	}
}