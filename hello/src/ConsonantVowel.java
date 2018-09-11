import java.io.*;
import java.util.*;
public class ConsonantVowel {
    public static void main (String args[]) {
        System.out.println("Enter a word");
        String inp;
        Scanner input = new Scanner(System.in);
        inp = input.nextLine();                              // Taking Input
        checkVowelOrConsonant(inp);
    }

    public static String checkVowelOrConsonant(String inp){
        int length;
        String answer = "";
        length = inp.length();
        for (int i = 0; i < length; i++) {                             // Program Logic
            if (inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u' || inp.charAt(i) == 'A' || inp.charAt(i) == 'E' || inp.charAt(i) == 'I' || inp.charAt(i) == 'O' || inp.charAt(i) == 'U') {
                answer = answer + "Vowel ";
            } else if ((inp.charAt(i) >= 'a' && inp.charAt(i) <= 'z') || (inp.charAt(i) >= 'A' && inp.charAt(i) <= 'Z')) {
               answer = answer + "Consonant ";
            } else {
                answer = answer + "Invalid Character in string ";
            }
        }
        return answer;
    }
}
