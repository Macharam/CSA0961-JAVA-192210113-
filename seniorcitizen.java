import java.util.*;
class seniorcitizen
{
    public static void main(String arg[]) 
     {
        Scanner sc = new Scanner(System.in);
        double principal,rate,time;
        String seniorcitizen;
        System.out.println("Enter the principal: ");
        principal = sc.nextDouble();
        System.out.println("Enter the time period:");
        time = sc.nextDouble();
        System.out.print("Are you a senior citizen (yes/no): ");
        seniorcitizen = sc.next();

        
        if (seniorcitizen.equals("yes"))
        {
            rate = 12;
        }
        else 
          {
            rate = 10;
        }

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}