 
import java.util.*; 
class Arithmetic 
{ 
 public static void main(String args[]) 
 { 
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter a,b values"); 
     int a=sc.nextInt(); 
     int b=sc.nextInt(); 
     try 
     { 
      int x=a/b; 
      System.out.println("output = "+x);    
     } 
     catch(Exception ex) 
     { 
      System.out.println("Division by zero error"); 
      System.out.println("Change the b value"); 
      } 
      finally 
      { 
        System.out.println("Always executed"); 
      } 
  } 
} 