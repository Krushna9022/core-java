class Result
{
	int marks[];
	void setMarks(int marks[])
	{
		this.marks=marks;
	}
}

class NineStd extends Result
{
	public void showNinePer()
	{	int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total+=marks[i];
		}
		double per= total/marks.length-1;
		 System.out.println("  marks of nine std is "+ total+" and percentage is "+per);
	}
}

class TenStd extends Result
{
	void setMarks(int marks[])
	{
		for(int i=0;i<marks.length;i++)
		{
			for(int j=i+1;j<marks.length;j++)
			{
				if(marks[i]<marks[j])
				{
					int temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
				}
			}
		}
		this.marks=marks;
	}
	
	void showTenPer()
	{
		int total=0;
		for(int i=0;i<marks.length-1;i++)//only five subject 
		{
			total+=marks[i];
		}
		 double per =total/marks.length-2;// 6-2=4 but i start with 0,1,2,3,4
		 System.out.println(" best five marks of ten std is "+ total+" and percentage is "+per);
	}
	
}
public class ResultApp
{
	public static void main(String x[])
	{
		int m[]=new int[]{60,90,80,70,80,70};
		
		NineStd nine=new NineStd(); //objec tof nine class 
		nine.setMarks(m);
		nine.showNinePer();
		
		TenStd ten=new TenStd();
		ten.setMarks(m);
		ten.showTenPer();
	}
}