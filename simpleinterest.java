import java.util.*;
class simpleinterest
{
  public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      double p,t,r,si;
      System.out.println("enter p");
      p=sc.nextDouble();
      System.out.println("enter t");
      t=sc.nextDouble();
      System.out.println("enter r");
      r=sc.nextDouble();
      si=(p*t*r)/100;
      System.out.println("simple interest:"+si);
    } 
}