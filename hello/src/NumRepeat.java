import java.util.Scanner;
public class NumRepeat {
    public static void main  (String args[]) {
        System.out.println ("Enter a number");    // Taking Input
        Scanner input = new Scanner(System.in);
        long number;                                  // Input Number initialized with number
        number = input.nextLong();

        for (int i = 1; i <= number; i++) {           // Program Logic to print required loop
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println ();
    }
}
