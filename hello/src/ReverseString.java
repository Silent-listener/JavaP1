import java.util.*;
public class ReverseString {
    public static void main(String args[]) {
        System.out.println("Enter a string for reversal");
        String in;
        int len;
        Scanner input = new Scanner(System.in);             // Taking Input
        in = input.nextLine();
        len = in.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(in.charAt(i));                 //Printing reverse string
        }
        System.out.println();
    }
}
