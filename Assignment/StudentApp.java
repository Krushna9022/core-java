public class StudentApp
{
	public static void main(String x[])
	{
		Student s=new Student();
		s.setId(1);
		s.setName("krushna");
		s.setActualfees(1000);
		s.setTotalfees(1000);
		
		DiscountFees dis=new DiscountFees();
		dis.setStudent(s);
		dis.displayDetail();
		dis.checkEligibility(70.0f);
		dis.displayDetail();
		
	}
}

class DiscountFees 
{
	Student s;
	
	public void setStudent(Student s)
	{
		this.s=s;
	}
	public void checkEligibility(float per)
	{
		if(per>60.0f)
		{
			double dis= (s.getActualfees()* 0.3);
			s.setDisfees(dis);
			double total=s.getActualfees()-s.getDisfees();
			s.setTotalfees(total);
		}
	}
	public void displayDetail()
	{
		System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getActualfees()+"\t"+s.getDisfees()+"\t"+s.getTotalfees()+"\t");
	}
}

class Student
{
	private int id;
	private double totalfees,disfees,actualfees;
	private String name;
	private float per;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int  getId()
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
	
	public void setActualfees(double actualfees)
	{
		this.actualfees=actualfees;
	}
	public double getActualfees()
	{
		return actualfees;
	}
	public void setDisfees(double disfees)
	{
		this.disfees=disfees;
	}
	public double getDisfees()
	{
		return disfees;
	}
	public void setTotalfees(double totalfees)
	{
		this.totalfees=totalfees;
	}
	public double getTotalfees()
	{
		return totalfees;
	}
	public void  setPer(float per)
	{
		this.per=per;
	}
	public float getPer()
	{
		return per;
	}
}