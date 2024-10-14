///program to calculate the total marks and percentage
public class TotMarksAndPercent
{
Public static void main()
 { 
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the marks of 5 Subject ");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  int d=sc.nextInt();
  int e=sc.nextInt();
  int total=a+b+c+d+e;
  float percent=((float)total/500)*100;
  System.out.printf("\n total marks= %d /n percentage=%f",total,percent);
 
 }
}