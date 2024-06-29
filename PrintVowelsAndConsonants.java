import java.util.*;
class PrintVowelsAndConsonants
{
 public static void main(String[] args)
  {
   char ch;
   int i;
   String vowels=" ",consonants=" ";
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter any String: ");
   String str = sc.nextLine();
   str = str.toLowerCase();
   for (i = 0; i < str.length(); i++) 
   {
   ch=str.charAt(i);
   if (ch =='a'||ch =='e'||ch =='i'|| ch == 'o'|| ch == 'u')
   {
    vowels+=ch;
   }
   else
   {
    consonants+=ch;
   }
   }
  System.out.println("vowels:"+" "+vowels);
  System.out.println("consonants:"+consonants);
  }
}