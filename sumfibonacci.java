import java.util.*;
class sumfibonacci
{
  public static void main(String arg[])
    {
      Scanner sc = new Scanner(System.in);
      int a=0,b=1,sum=0,i,n,c;
      System.out.println("Enter the number n: ");
      n = sc.nextInt();
      for(i=0;i<=n*2;i++)
      {
       if(i%2==0)
       {
         sum+=a;
       }
       c=a+b;
       a=b;
       b=c;
      }
        System.out.println("Sum of even Fibonacci numbers up to " + n + ": " + sum);

    } 
} 