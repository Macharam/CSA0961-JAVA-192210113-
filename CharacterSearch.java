import java.util.*;
public class CharacterSearch 
{
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to be searched: ");
        char ch = sc.next().charAt(0);
        boolean found=false;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch) 
             {
               System.out.println(ch + " is found in string at index: " + i);
               return;
             }
        }

        System.out.println(ch + " is not found in string");
    }
}