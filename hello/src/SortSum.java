import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortSum {

    public static void main (String args[]) {
        System.out.println ("Enter a number");
        Scanner input = new Scanner(System.in);
        String inp;
        inp = input.nextLine();                          // Taking Input
        int length;
        int evensum = 0;
        length = inp.length();

        String strarray[] = inp.split("");           //Using Split function
        int intarray[] = new int [strarray.length];

        for ( int count = 0; count < intarray.length; count++ ) {
            intarray[count] = Integer.parseInt(strarray[count]);        // Parsing string into integers
        }

        java.util.Arrays.sort( intarray );                              //Sorting the array

        //Arrays.sort( intarray , Collections.reverseOrder());

        System.out.println ("Sorted number inp non-increasing order : ");
        for ( int count = (intarray.length) - 1; count >=0; count-- ) {
            System.out.print (intarray[count]);
            if ( intarray[count] % 2 == 0 ) {
                evensum = evensum + intarray[count];                    //Taking sum of even numbers
            }
        }
        System.out.println ();
        System.out.println ("Sum of even numbers : " + evensum);
        if ( evensum > 15 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
