import java.util.Scanner;
public class LowercaseOrUppercase
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Alphabet to know it is upper or lower case");
char a=sc.next().charAt(0);
 //System.out.println(a);
 //char b=(char)(a-32);
 String s=('a'>=a&&a<='z')?"uppercase":"Lowercase";
 

 System.out.println(s);

}
}
