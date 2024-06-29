import java.util.*;

class btod 
{
  public static void main(String args[]) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    int binary = sc.nextInt();
    int decimal = 0;
    int power = 0;
    while (binary!= 0) 
     {
      decimal += (binary % 10) * Math.pow(2, power);
      binary /= 10;
      power++;
    }
    System.out.println("Decimal value: " + decimal);
  }
}