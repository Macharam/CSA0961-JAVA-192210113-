import java.util.*;
class PrintVowelsAndConsonantscount
{
 public static void main(String[] args)
  {
    int vcount=0,ccount=0,i;
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any String: ");
    String str = sc.nextLine();
    str = str.toLowerCase();
    int n=str.length();
    for (i= 0; i< n; i++) 
    {
    ch=str.charAt(i);
    if (ch =='a'||ch =='e'||ch =='i'|| ch == 'o'|| ch == 'u')
    {
      vcount++;
    }
    else 
    {
      ccount++;
    }
    }
    System.out.println("No of vowels given in String: "+vcount);
    System.out.println("No of consonant given in String: "+ccount);

  }

}