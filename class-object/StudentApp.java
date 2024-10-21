import java.util.*;
class Student 
{
	float per;
	int total;
	int marks[];
	public void setSubmarks(int s[])
	{
		marks=s;
	
	}
	public void calculatePer()
	{
		for(int i=0;i<marks.length;i++)
		{
			total +=marks[i];
			per=total/marks.length;
		}
			System.out.println(total);
			System.out.println(per);
	}
	public void checkGrades()
	{
		if(per>=75 &&per<=100)
		{
			System.out.println("Distinction");
		}
		else if(per>=60 &&per<=74)
		{
			System.out.println("First Division");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Second Division");
		}
		else if(per>40 &&per<50)
		{
			System.out.println("third Divison");
		}
		else 
		{
			System.out.println("fail");
		}
			
			
	}
}

public class StudentApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Student s=new Student();
		int marks[]=new int [5];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		s.setSubmarks(marks);
		//s.setSubmarks(new int[]{80,50,80,70,80,});
		s.calculatePer();
		s.checkGrades();
	}
	
}
