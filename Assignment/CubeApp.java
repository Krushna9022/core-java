import java.util.*;
public class CubeApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find Cubes");
		int a=sc.nextInt();
		Cube cube=new Cube();
		cube.setValue(a);
		int c=cube.getCube();
		System.out.println(c);
		
	}

}

class Cube
{
	int x;
	public void setValue(int x)
	{
		this.x=x;
	}
	public int getCube()
	{
		x=x*x*x;
		return x;
	}
}