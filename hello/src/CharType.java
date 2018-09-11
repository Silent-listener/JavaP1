import java.io.*;
import java.util.*;
public class CharType {
    public static void main(String args[]) {
        System.out.println("Enter a Character");
        char inp;
        Scanner input = new Scanner(System.in);
        inp = input.next().charAt(0);                        // Taking Input
    }



    public String typeOfChar(char inp) {
        try {
            if (inp >= 'A' && inp <= 'Z') {                          // Program Logic
                return "Upper Case";
            } else if (inp >= 'a' && inp <= 'z') {
                return "Lower Case";
            } else if (inp >= '0' && inp <= '9') {
                return "Digit";
            } else {
                return "Special Character";
            }
        } catch (Exception e) {
            String error = "Error";
            return error;
        }

    }
}