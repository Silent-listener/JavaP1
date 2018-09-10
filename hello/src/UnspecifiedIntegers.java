import java.io.*;
import java.util.*;
public class UnspecifiedIntegers {
    public static void main(String args[]) {
        try{                                                //Exception Handling for illegal input
            System.out.println("Enter a number");
            Scanner input = new Scanner(System.in);
            String in;
            in = input.nextLine();                          // Taking Input
            int length, sum = 0;
            length = in.length();

            String strarray[] = in.split(" ");        //Using Split function
            int intarray[] = new int[strarray.length];

            for (int count = 0; count < intarray.length; count++) {
                intarray[count] = Integer.parseInt(strarray[count]);  // Parsing string into integers
            }

            for (int count = 0; count < intarray.length; count++) {
                sum = sum + intarray[count];
            }
            System.out.println(sum);
        }
        catch(NumberFormatException e)
        {
            System.out.println ("Illegal Input");
        }
    }
}
