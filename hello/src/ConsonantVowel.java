import java.io.*;
import java.util.*;
public class ConsonantVowel {
    public static void main (String args[]) {
        System.out.println("Enter a word");
        String inp;
        int length;
        Scanner input = new Scanner(System.in);
        inp = input.nextLine();                              // Taking Input
        length = inp.length();
        for ( int i=0 ; i<length ; i++) {                             // Program Logic
            if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u' || inp.charAt(i) == 'A' || inp.charAt(i) == 'E' || inp.charAt(i) == 'I' || inp.charAt(i) == 'O' || inp.charAt(i) == 'U' ){
                System.out.println("Vowel ");
            }
            else if ((inp.charAt(i)>='a' && inp.charAt(i)<='z') ||(inp.charAt(i)>='A' && inp.charAt(i)<='Z') ) {
                System.out.println("Consonant ");
            }
            else {
                System.out.println("Number ");
            }
        }

    }
}
