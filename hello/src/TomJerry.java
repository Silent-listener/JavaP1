import java.util.Scanner;
public class TomJerry {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);     // Initializing scanner
        long n;
        n = input.nextLong();                       // Taking Input
    }
        public String EvenOdd(int n){
            if (n % 2 == 0) {                           // Logic to check even numbers
                if (n > 20 && n < 30) {
                    return "Tom";
                } else {
                    return "Number does not lie between 20 and 30";
                }
            } else {
                if (n > 20 && n < 30) {
                    return "Jerry";

                } else {
                    return "Number does not lie between 20 and 30";
                }
            }
        }
    }

