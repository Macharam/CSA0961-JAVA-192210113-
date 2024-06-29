import java.util.*;

class BinaryToDecimalOctal
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    int binary = sc.nextInt();
    int decimal = Integer.parseInt(String.valueOf(binary), 2);
    String octal = Integer.toOctalString(decimal);

    System.out.println("Decimal value: " + decimal);
    System.out.println("Octal value: " + octal);
  }
}