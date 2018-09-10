import java.util.Scanner;
public class PalindromeCheck {
    public static void main (String args[]) {
        System.out.println ("Enter a number");
        Scanner input = new Scanner( System.in);
        long n;                                  // Input Number initialized with n
        n = input.nextLong();                    // Taking Input
        long temp = n;
        long even = 0;
        long sum = 0;
        long r;

        while (n > 0) {                          // Program Logic to check palindrome
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
            if (r % 2 == 0) {                    // Logic to sum even numbers
                even = even + r;
            }
        }

        if ( temp == sum ) {
            if (even > 25) {
                System.out.println (temp+" is a palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println (temp+" is a palindrome and sum of even numbers is less than 25");
            }
        } else {
            System.out.println (temp+" is not a palindrome");
        }
    }

}
