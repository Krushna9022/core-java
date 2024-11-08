class ArrParent
{
	int arr[];
	void setArray(int arr[])
	{
			this.arr=arr;
	}
}

class SortArr extends ArrParent
{
	public  int[] sortArr()
	{
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}

class Max extends ArrParent
{
	public int getMax()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}

class Min extends ArrParent
{
	public int getMin()
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}

public class ArrayOperationApp
{
	public static void main(String x[])
	{
		 SortArr sort = new SortArr(); 
		 sort.setArray(new int[]{2,9,7,1,8});
		 int res[]=sort.sortArr();
		 System.out.println("Printing the sorted array");
		 for(int i:res)
		 {
			System.out.print(i+" ");
		 }
		 
		 Max m=new Max();
		 m.setArray(new int []{5,6,9,8,7});
		 int maxvalue=m.getMax();
		 System.out.println("\nmax element is "+maxvalue);
		 
		Min min=new Min();
		min.setArray(new int []{5,5,6,9,8,1,7});
		int minvalue=min.getMin();
		System.out.println("\nmax element is "+ minvalue);
	}
}