import java.util.Scanner;
public class TomJerry {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);     // Initializing scanner
        long n;
        n = input.nextLong();                       // Taking Input
        if (n % 2 == 0) {                           // Logic to check even numbers
            if (n > 20 && n < 30) {
                System.out.println ("Tom");
            } else {
                System.out.println ("Number does not lie between 20 and 30");
            }
        } else {
            if (n > 20 && n < 30) {
                System.out.println ("Jerry");

            } else {
                System.out.println ("Number does not lie between 20 and 30");
            }
        }
    }
}

