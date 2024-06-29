import java.util.*;
class Armstrong
{
    public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        int num,rev=0,rem,temp;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        temp=num;
        while(num!=0)
        {
          rem=num%10;     
          rev=rev+(rem*rem*rem);
          num=num/10;
        }
        if(temp==rev)
        {
          System.out.println("armstrong");
        }
         else
         {
           System.out.println("not armstrong");
         }
       }
}    