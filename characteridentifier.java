import java.util.Scanner;
public class characteridentifier {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter character: ");
     String a = input.next();
     char c;  
     int len = a.length();
     String b = a.toLowerCase();
     c = b.charAt(0);
     if (len>1)
     {
        System.out.println(" * ERROR! * ");
     }
     if (c == 'a' || c =='e' || c =='i' || c =='o' || c =='u')
     {
        System.out.println(" * VOWEL * ");
     }
     else 
     {
        System.out.println(" * CONSONANT * ");
     }
     
     input.close();
    }
}
