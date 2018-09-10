import java.util.*;
public class StringCharRepeat {
    public static void main (String args[]) {
        System.out.println ("Enter a string for reversal");
        String inputstr;
        int inp;
        int length;
        int temp;
        Scanner input = new Scanner(System.in);
        inputstr = input.nextLine();                                    // Taking Input String
        System.out.println ("Enter integer value <= string length");
        inp = input.nextInt();                                           // Taking input integer
        temp = inp;
        length = inputstr.length();
        for (int i=0; i<length;i++) {
            System.out.print(inputstr.charAt(i));
        }
        while (temp!=0) {
            for (int i = length - inp; i < length; i++) {
                System.out.print (inputstr.charAt(i));
            }
            temp--;
        }
    }
}