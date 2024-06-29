import java.util.*;
class ValidUsername
{
  public static void main(String arg[])
  {
    String s1;
    String s2;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter username:");
    s1=sc.nextLine();
    System.out.print("Re-enter username:");
    s2=sc.nextLine();
    if(s1.equals(s2))
    {
      System.out.println("valid username");
    }
    else
    {
      System.out.println("not valid username");
    }
  }
}