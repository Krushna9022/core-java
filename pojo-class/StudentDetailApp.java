class Student
{
	private float id;
	private float disFees;
	private float actualPaidFees;
	private float totalfees;
	private String name;
	private float per;
	
	public void setId(float id)
	{
		this.id=id;
	}
	public float getId()
	{
		return id;
	}
	public void setDisFees(float disFees)
	{
		this.disFees=disFees;
	}
	public float getDisFees()
	{
		return disFees;
	}
	public void setActualPaidFees(float actualPaidFees)
	{
		this.actualPaidFees=actualPaidFees;
	}
	public float getActualPaidFees()
	{
		return actualPaidFees;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPer(float per)
	{
		this.per=per;
	}
	public float getPer()
	{
		return per;
	}
	public void setTotalfees(float totalfees)
	{
		this.totalfees=totalfees;
	}
	public float getTotalfees()
	{
		return totalfees;
	}
}

class DiscountFees
{
	Student student;
	public void setStudent( Student student)
	{
		this.student=student;
	}
	public void checkEligibility( float per)
	{
		if(per>60.0)
		{	float dis=student.getTotalfees()*(0.3f);
			student.setDisFees(dis);
			System.out.println(dis);
			float actualPaidFees=student.getTotalfees()-student.getDisFees();
			student.setActualPaidFees(actualPaidFees);
		}
		
	}
	
	public void showDetail()
	{	System.out.println("Name"+"\t"+"Id"+"\t"+"toalfees"+"\t"+"disFees"+"\t"+"actualPaidfees");
		System.out.println(student.getName()+"\t"+student.getId()+"\t"+student.getTotalfees()+"\t\t"+student.getDisFees()+"\t\t"+student.getActualPaidFees());
	}
}

public class StudentDetailApp
{
	public static void main(String x[])
	{
		Student s=new Student();
		
		s.setId(1);
		s.setName("krushna");
		s.setTotalfees(1000);
		//s.setPer(70.0f);
		
		DiscountFees dis=new DiscountFees();
		dis.setStudent(s);
		dis.checkEligibility(70);
		dis.showDetail();
	}
}
  
/*

Id      Name     Rate   qty     total
1       p2      3       100     300
4       p1      9       10      90
2       p3      4       50      200
================================
                        590

*/