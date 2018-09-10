import java.io.*;
import java.util.*;
public class CharType {
    public static void main(String args[]){
        System.out.println("Enter a Character");
        char inp;
        Scanner input = new Scanner(System.in);
        inp = input.next().charAt(0);                        // Taking Input
        if (inp >='A' && inp <='Z') {                          // Program Logic
            System.out.println("UpperCase");
        } else if ( inp >='a' && inp <='z') {
            System.out.println("LowerCase");
        } else if (inp >='0' && inp <='9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
