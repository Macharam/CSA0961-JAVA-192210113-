import java.util.Scanner;

public class SpecialCharacters
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statement:");
        String statement = scanner.nextLine();
        int splCharacterCount = 0;
        for (int i = 0; i < statement.length(); i++) 
        {
          char ch = statement.charAt(i);
          if (!((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')||(ch >= '0' && ch <= '9') || ch == ' '||ch==',')) 
          {
                splCharacterCount++;
          }
           
        }

        System.out.println("Number of special Characters: " + splCharacterCount);
    }
}