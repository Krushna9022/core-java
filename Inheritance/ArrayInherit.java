class ArrayParent
{	int arr[];
	void setArray(int arr[])
	{	this.arr=arr;
	}
}
class SubArray extends ArrayParent
{ 	int sub[];
	void setIndex(int start,int end)
	{   int count=0;
		int j=0;
		for(int i=start;i<=end;i++)
		{
			count++;
		}
		 sub=new int[count];
		for(int i=start;i<=end;i++)
		{
			sub[j++]=arr[i];
		}
	}
	int[] getSubArr()
	{
		return sub;
	}
}

class FindSumSubArr extends ArrayParent
{
	int x;
	void setValue(int x)
	{
		this.x=x;
	}
	void findSubArrWithSum()
	{
		for(int i=0;i<arr.length;i++)
		{   int sum=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{ sum+=arr[j];
				if(x==sum)
				{
					for(int k=i;k<=j;k++ )
					{
						System.out.print(arr[k]);
					}
					return;
				}	
				
			}
		}
	}
}

public class ArrayInherit
{
	public static void main(String x[])
	{
		SubArray s=new SubArray();
		s.setArray(new int[]{1,2,3,4,5,6,7,8,9});
		s.setIndex(3,6);
		int res[]=s.getSubArr();
		for(int i:res)
		{
			System.out.print(i);
		}
		
		System.out.println();
		FindSumSubArr f=new FindSumSubArr();
		f.setArray(new int[]{1,2,3,4,5,6,7,8,9});
		f.setValue(9);
		f.findSubArrWithSum();
		
	}
}


