import java.util.*;
class Primeorcomposite
{
    public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        int num,i;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        for(i=2;i<num;i++)
        { 
          if(num%i!=0)
          { 
            System.out.println("prime number");
          break;
          }
          
          else
          {
           System.out.println("composite number");
           break;
          }
        }
       }
 }

            
       