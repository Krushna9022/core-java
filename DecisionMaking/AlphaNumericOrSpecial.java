import java.util.*;
class AlphaNumericOrSpecial
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
char c=sc.nextLine().charAt(0);


  
	if(c>=65 &&c<=90)
      {
	  //c=(char)((int)c+32));
	  System.out.println("Upper  "+c);
    }
	 else if(c>=97&&c<=122)
      {
	  //c=(char)((int)c-32));
	  System.out.println("Lower "+c);
    }
	else if(c>=47&&c<=57)
	{
		 System.out.println("number "+c);
	}
	else{
		 System.out.println("specila "+c);
	}


}
}