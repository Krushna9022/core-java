import java.util.*;
public class VowelOrConsonant
{
public static void main(String x[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the character");
char  a=sc.next().charAt(0);

String s=(a=='a')|| (a=='e')||(a=='i') || (a=='o') ||(a=='u') ? "Vowel":"Consonant";


System.out.println(s);
}
}