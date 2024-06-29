import java.util.*;
class StringOperations
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the string:");
    String s1=sc.nextLine();

    // replace word in string
    String replaced=s1.replace("saveetha","SRM");
    System.out.println("replaced string:" +replaced);

    // length
    int length=s1.length();
    System.out.println("length of the string:" +length);

    // upper case
    String uppercase=s1.toUpperCase();
    System.out.println("uppercase:" +uppercase);
  }
}