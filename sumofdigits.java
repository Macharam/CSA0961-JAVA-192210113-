import java.util.*;
class sumofdigits
{
    public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        int num,rev=0,rem;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        while(num!=0)
        {
          rem=num%10;     
          rev=rev+rem;
          num=num/10;
        }
           System.out.println("sum of digits"+rev);
       }
}    